package za.web.skerwe.adventofcode;

import java.util.*;

public class Day7 {

  public String part1(String[] input) {
    HashMap<String, Structure> towerOfPrograms = process(input);
    Optional<Structure> rootTower = getTheRootTower(towerOfPrograms);
    return rootTower.isPresent() ? rootTower.get().getName() : "NOT_FOUND";
  }

  public int part2(String[] input) {
    HashMap<String, Structure> towerOfPrograms = process(input);
    Optional<Structure> rootTower = getTheRootTower(towerOfPrograms);

    if (!rootTower.isPresent()) {
      return -1;
    }

    return findBalance(towerOfPrograms.get(rootTower.get().getName()));
  }

  private Optional<Structure> getTheRootTower(HashMap<String, Structure> towerOfPrograms) {
    Structure rootTower = null;
    for (Structure tower : towerOfPrograms.values()) {
      if (tower.getParent() == null) {
        rootTower = tower;
        break;
      }
    }

    return Optional.of(rootTower);
  }

  private HashMap<String, Structure> process(String[] towers) {
    HashMap<String, Structure> towerOfPrograms = new HashMap<>();

    Structure structure;
    for (String tower : towers) {
      structure = buildStructure(tower);
      towerOfPrograms.put(structure.getName(), structure);
    }

    for (Structure tower : towerOfPrograms.values()) {
      if (tower.getLinkNames().size() > 0) {
        for (String linkName : tower.getLinkNames()) {
          Structure child = towerOfPrograms.get(linkName);
          child.setParent(tower);
          tower.addChildLink(linkName, child);
        }
      }
    }

    return towerOfPrograms;
  }

  private Structure buildStructure(String tower) {
    String[] programs = tower.split(" ");

    Structure structure = new Structure(programs[0],
        Integer.parseInt((programs[1].replace('(', ' ').replace(')', ' ')).trim()));

    if (programs.length > 2) {
      for (int i = 3; i < programs.length; i++) {
        structure.addLinkName(programs[i].replace(',', ' ').trim());
      }
    }
    return structure;
  }

  // private void findBalance2(Structure structure) {
  // int stableValue = 0;
  // int diffValue = 0;
  // Structure oddChild = null;
  //
  // for (Structure child : structure.getLinks().values()) {
  // int stackWeight = child.getWeight() + calcChildWeight(child);
  // System.out.println(stackWeight);
  //
  // if (stableValue == 0) {
  // stableValue = stackWeight;
  // } else if (stackWeight > stableValue) {
  // oddChild = child;
  // diffValue = stackWeight - stableValue;
  // stableValue = stackWeight;
  // }
  // }
  //
  // if (oddChild != null) {
  // System.out.println(oddChild.getName() + " Was="+oddChild.getWeight()+",
  // Now="+(oddChild.getWeight()-diffValue));
  // }
  // }

  private int calcChildWeight(Structure structure) {
    int totalWeight = 0;
    for (Structure child : structure.getLinks().values()) {
      totalWeight += child.getWeight() + calcChildWeight(child);
    }
    return totalWeight;
  }

  private int findBalance(Structure structure) {
    // int totalStackValue = structure.getWeight();
    int stableValue = 0;
    int diffValue = 0;
    Structure oddChild = null;

    HashMap<String, Integer> c = new HashMap<>();
    HashMap<Integer, Structure> d = new HashMap<>();
    HashMap<Integer, Integer> e = new HashMap<>();

    for (Structure child : structure.getLinks().values()) {
      findBalance(child);
      int stackWeight = child.getWeight() + calcChildWeight(child);
      c.put(child.getName(), stackWeight);
      d.put(stackWeight, child);
      if (e.get(stackWeight) == null) {
        e.put(stackWeight, 1);
      } else {
        Integer i = e.get(stackWeight) + 1;
        e.put(stackWeight, i);
      }
      // totalStackValue += stackWeight;
      // System.out.println(totalStackValue);
      // System.out.println(stackWeight);

      // if (stableValue == 0) {
      // stableValue = stackWeight;
      // } else if (stackWeight > stableValue) {
      // oddChild = child;
      // diffValue = stackWeight - stableValue;
      // stableValue = stackWeight;
      // }
    }

    int ck = -1;
    int odCk = -1;

    if (d.size() > 1) {
      for (Integer value : c.values()) {
        System.out.println(value);
      }
      for (Integer key : e.keySet()) {
        if (ck == -1) {
          ck = e.get(key);
          odCk = key;
        } else if (e.get(key) < ck) {
          ck = e.get(key);
          odCk = key;
        }
      }
    }

    if (odCk > -1) {
      oddChild = d.get(odCk);
    }

    if (oddChild != null) {
      // System.out.println(stableValue+":"+diffValue);
      System.out
          .println(oddChild.getName() + " Was=" + oddChild.getWeight() + ", Now=" + (oddChild.getWeight() - diffValue));
    }
    return structure.getWeight();
  }

  class Structure {
    private String name;
    private int weight;
    private Structure parent;
    private List<String> linkNames = new ArrayList<>();
    private HashMap<String, Structure> links = new HashMap<>();

    public Structure(String name, int weight) {
      this.name = name;
      this.weight = weight;
    }

    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }

    public int getWeight() {
      return weight;
    }

    public void setWeight(int weight) {
      this.weight = weight;
    }

    public Structure getParent() {
      return parent;
    }

    public void setParent(Structure parent) {
      this.parent = parent;
    }

    public List<String> getLinkNames() {
      return linkNames;
    }

    public void setLinkNames(List<String> linkNames) {
      this.linkNames = linkNames;
    }

    public void addLinkName(String linkName) {
      this.linkNames.add(linkName);
    }

    public HashMap<String, Structure> getLinks() {
      return links;
    }

    public void setLinks(HashMap<String, Structure> links) {
      this.links = links;
    }

    public void addChildLink(String linkName, Structure child) {
      links.put(linkName, child);
    }

    public int getChildrenWeight() {
      int total = this.weight;
      for (Structure child : this.links.values()) {
        total += child.getChildrenWeight();
      }
      return total;
    }

    @Override
    public String toString() {
      return "Structure{name='" + name + "', weight=" + weight + "}";
    }
  }
}
