package za.web.skerwe;

import java.util.*;

public class Day7 {

    private static String input = "uwzmqi (57)\n" +
            "emlzcpy (106) -> pwmoihf, sdwnkb\n" +
            "oevnzwt (90)\n" +
            "imjhra (23)\n" +
            "uuimn (299)\n" +
            "xzpov (55)\n" +
            "kynja (73)\n" +
            "kggcnt (43)\n" +
            "qdxpkx (67)\n" +
            "wubltb (276) -> udcok, pihpjbp, hiifqwb\n" +
            "anifo (10)\n" +
            "zxdpmwl (57)\n" +
            "tkdmopp (44)\n" +
            "kdsbbcf (193) -> huyizg, evofb\n" +
            "pxfpf (235)\n" +
            "mjftixu (131) -> kwzsj, rspilzk, amtxw\n" +
            "dbtoizo (73)\n" +
            "fdqmg (124) -> kggcnt, dzekyo\n" +
            "egvfxip (23)\n" +
            "mpijek (63)\n" +
            "kkoitqr (70)\n" +
            "jgwvyp (29) -> hoagrj, swefql\n" +
            "guipj (25) -> sauwet, graedp, jdvya, bmlwb, eidmza, kmnmx\n" +
            "ayuhvb (216) -> bemhni, gvpac\n" +
            "unmxfe (91)\n" +
            "miwfyq (96)\n" +
            "loofhh (31)\n" +
            "liczn (12)\n" +
            "urvunmn (63) -> ddsmt, oablvt\n" +
            "jxdqhu (60)\n" +
            "pvqfa (174) -> pftmymi, vmrdwe\n" +
            "xrabl (82) -> ivyarjy, lhxinfd\n" +
            "rfvtfs (93)\n" +
            "qkrirn (129) -> ceztn, tqjmaxi, lwroef\n" +
            "epnny (85) -> xltlyvw, ctkjip\n" +
            "hlzyncx (85)\n" +
            "fyxdfod (82)\n" +
            "bawgh (7)\n" +
            "sxpqvwv (358) -> oziwd, rreoxyc, qntqokn, acibw\n" +
            "nogbp (119) -> psvkj, djyks\n" +
            "mgdhu (15) -> cfcbhku, fltdrlc\n" +
            "nsvan (1749) -> ahracx, dvoul, ecxayrz\n" +
            "gefrwix (99) -> sovfoi, vdqpuon, ghtdnrx\n" +
            "hfrtlx (57)\n" +
            "kyhace (12)\n" +
            "gbcfg (277) -> pzbgmxx, lysysqu, urvunmn, yiohbo, hqjlgre\n" +
            "uhwsavi (57)\n" +
            "fyynsgp (6)\n" +
            "wqobawc (67)\n" +
            "agjdl (61)\n" +
            "tkureky (247)\n" +
            "czalivu (28)\n" +
            "wykyl (64)\n" +
            "wqtbny (49)\n" +
            "wnhkac (18)\n" +
            "fuhbamv (81)\n" +
            "wqudy (238) -> dpkdpj, jmmticn, kpotsk, qtntw\n" +
            "latvu (35)\n" +
            "inpjzmh (23)\n" +
            "orawnkw (195) -> bsqlkiy, fhhzvwj\n" +
            "kwzsj (40)\n" +
            "ymfwoto (50)\n" +
            "kckucu (152) -> mnoaa, infll\n" +
            "fwlme (6)\n" +
            "xlyxjyx (302) -> lewizr, duxfof, uqazvo, mzbwym\n" +
            "aksgboa (93)\n" +
            "rxxqpi (920) -> gwwphk, xaskpny\n" +
            "gqqgsz (49)\n" +
            "rlbdave (27)\n" +
            "fuunnks (42) -> cstnc, dyxmvo, kwtszff, ittpbzy\n" +
            "bhcwhrf (88)\n" +
            "ppigbow (84)\n" +
            "bbzhhk (70) -> bjrfinh, lissl\n" +
            "hsael (60)\n" +
            "tcpdvk (33)\n" +
            "yvbgs (286) -> byaaoab, kebefwy, wpxxz\n" +
            "utjtx (8) -> rzlkr, ntfvgoj, qmvpgee\n" +
            "kdcyull (48)\n" +
            "ldakuz (45)\n" +
            "lcfpcst (92)\n" +
            "ufnpup (102) -> cewmc, uwzmqi\n" +
            "eavfy (87)\n" +
            "lufgbo (60)\n" +
            "sncjicb (102) -> xslucv, jbpvtf, gfltww\n" +
            "lydjsu (65)\n" +
            "aclnw (210)\n" +
            "fqdtzfy (221) -> zwfly, bidasc, mjfhodb\n" +
            "wavbwew (80)\n" +
            "sqwfq (59)\n" +
            "yeicqcy (46)\n" +
            "chzrjqp (90)\n" +
            "fhabfp (59)\n" +
            "wbijkw (19) -> zzdbn, pqxef, ikzqhu, dyqgl\n" +
            "gbhlxb (75)\n" +
            "zpimcy (83)\n" +
            "zmjzmyq (35)\n" +
            "pagsex (45)\n" +
            "onsjs (197)\n" +
            "gqiczm (61) -> gwsceo, ucocdl, hdqow, fjqccm, oxvqjeh\n" +
            "hmdqubz (16) -> juzol, txote, kynja\n" +
            "lzikkl (330) -> cdrjh, lwbcn\n" +
            "haadpw (65)\n" +
            "eeluucp (62) -> pxsmani, qdmop\n" +
            "nnsogp (60)\n" +
            "nezhs (94)\n" +
            "fqrwf (88) -> hujzcku, tkdmopp, ckgmjsg\n" +
            "zoszls (70)\n" +
            "uzlgko (56) -> loyjp, wwnkoz\n" +
            "uqazvo (39)\n" +
            "sphktgz (12)\n" +
            "sikpe (48)\n" +
            "rsjmc (53)\n" +
            "htyvy (17)\n" +
            "ylluriq (129) -> pawmnl, uhmnltu\n" +
            "mrsxl (18)\n" +
            "gbkubnt (45)\n" +
            "xdvwjb (70)\n" +
            "jguhhsb (9)\n" +
            "mfyivv (84)\n" +
            "etsxvmj (896) -> enlfaa, ymnichj, tuefd, zhkmnxk, vcllnn\n" +
            "cougztw (27)\n" +
            "ewifyk (25) -> sxino, vgwxuan\n" +
            "vwtxaci (78) -> nnkpuhp, haadpw\n" +
            "vwqof (64)\n" +
            "cewmc (57)\n" +
            "haztq (48)\n" +
            "wxyhyh (43)\n" +
            "dyxmvo (107) -> tnham, jsdvowc\n" +
            "zhcmvvm (90)\n" +
            "zdrwxqt (89)\n" +
            "bluacvc (26)\n" +
            "yxfysz (418) -> cfmcrf, ixbsb, kafyh, zouqjoo\n" +
            "hiifqwb (14)\n" +
            "knsphtv (74)\n" +
            "xrwnzgz (21)\n" +
            "xtbqb (82) -> bydmdru, awfnh\n" +
            "zngystc (140) -> gszlkf, inkfmx\n" +
            "gtktonk (92)\n" +
            "ukkph (17)\n" +
            "fzowmer (22)\n" +
            "gumpsin (34)\n" +
            "rynlaj (292)\n" +
            "wjhgb (48) -> icoic, hwhgi\n" +
            "ndvns (24)\n" +
            "cawzw (81)\n" +
            "kyphnel (51)\n" +
            "uawyee (22)\n" +
            "mzftrlb (70)\n" +
            "xfxsxh (71)\n" +
            "wzlonwk (65)\n" +
            "inkfmx (30)\n" +
            "vkkds (207) -> pvhdt, fshoj, dsuonma, vuazmuj\n" +
            "wdwgd (80)\n" +
            "licby (79)\n" +
            "ytlpe (77)\n" +
            "usddqi (170) -> fgokr, mdznc, psynxr\n" +
            "ychaa (47)\n" +
            "ztuswk (7)\n" +
            "rtchnfd (162) -> eptve, lejuo\n" +
            "bymrwvc (67)\n" +
            "xqusi (22) -> jdbmary, flrdpaj, iwysxj, tooduon\n" +
            "gyivxga (26) -> cldaf, lqgvx\n" +
            "eptve (37)\n" +
            "aflaj (35)\n" +
            "ghnldf (35)\n" +
            "oldfs (34)\n" +
            "bkdxl (85)\n" +
            "qsiqu (114) -> efvvtgo, hcfgf, fgayln, xzkzoq, isuevmr, xqyyni, rjfqyz\n" +
            "abjrozg (189) -> dlcep, rhwfl\n" +
            "fjemwxf (69) -> ofxdo, jjkns, mwvihj, vrhke\n" +
            "zuapfco (40)\n" +
            "tqcwn (50)\n" +
            "ouycck (1843) -> lmliqa, txtnweq\n" +
            "hkelse (71)\n" +
            "wifvw (68) -> cpoxc, btlczl, dqzsblu\n" +
            "cxfvbz (807) -> vazst, evquf, pvcpmx\n" +
            "quxtc (142) -> tcpdvk, npwrqsm\n" +
            "fltdrlc (90)\n" +
            "fivaym (45)\n" +
            "jdvro (43) -> wkkqsy, wdwgd\n" +
            "qinwdk (178) -> liueudh, zgtsnwk\n" +
            "zautz (48)\n" +
            "flmeo (338) -> auocy, uqkhzxt\n" +
            "zziuivt (78)\n" +
            "iooqbyk (1558) -> fuhbamv, dqrsxx\n" +
            "vumxuur (99)\n" +
            "awfnh (60)\n" +
            "woeabie (18)\n" +
            "xtqnalt (19)\n" +
            "xedlv (67)\n" +
            "jatrdb (229) -> njnyoek, ctvhcv, qsgjk\n" +
            "axjkbq (188) -> hgoruv, iimyku\n" +
            "hmenje (183) -> npefyxi, fwoyu, acueoez\n" +
            "zxwmd (96)\n" +
            "zapbrn (421) -> szzhp, jsvwb\n" +
            "tmwvxgi (179) -> egvfxip, gohxocn, wgvlq\n" +
            "fkagr (32)\n" +
            "wppgjkw (187) -> hlmdgp, usglf\n" +
            "wajnp (54)\n" +
            "hbgeak (92)\n" +
            "rnbvott (157) -> kaekzo, hbozym\n" +
            "haurusk (170) -> kxgrtg, ythbw\n" +
            "ylpvre (48)\n" +
            "zmuit (131) -> vrzrsz, uawyee, jbxllu\n" +
            "mnoaa (59)\n" +
            "zttpfsd (20)\n" +
            "solmej (193) -> wnhkac, gkjafru, cmfwb\n" +
            "lkzdum (33)\n" +
            "vhpjrh (64)\n" +
            "sqwejs (47)\n" +
            "xxufma (17)\n" +
            "eshjt (10)\n" +
            "vrzrsz (22)\n" +
            "pvhdt (23)\n" +
            "dtqyhj (96)\n" +
            "htmrm (85)\n" +
            "tbsmz (70)\n" +
            "hezjirm (54)\n" +
            "cozhzk (62) -> fkagr, dqyaco\n" +
            "jcrmny (70)\n" +
            "zpadu (96)\n" +
            "lfszf (50)\n" +
            "vpnfkw (80) -> ewzvs, jbitbzb\n" +
            "rphgr (895) -> gkfymj, rtchnfd, gtyfx, ujdhkyw\n" +
            "bmlwb (481)\n" +
            "mzaxe (52) -> itzntrm, wqtbny, jyhddhe, zgatapc\n" +
            "qxzhq (180) -> ezjqb, kiceppo, zkiotrm, gqqgsz\n" +
            "bkfxvy (1563) -> bkvuz, dbtoizo\n" +
            "utaxgw (57) -> bupugpv, gnqxls, rnvenxi\n" +
            "vcuizl (119) -> maklk, bxyvuvc\n" +
            "ydbzo (57)\n" +
            "lhagpts (737) -> utjtx, bcyipmu, vcuizl\n" +
            "dkbycez (131) -> vagyecy, fvzfdr\n" +
            "kdyuwjh (92)\n" +
            "udcok (14)\n" +
            "xssia (80)\n" +
            "hrzvmel (34)\n" +
            "dupdsj (81) -> hgsiz, yeicqcy, fncsm\n" +
            "gseohkk (29)\n" +
            "dllffsl (54)\n" +
            "ixbsb (104) -> gjbikl, cogziqp, gdibw\n" +
            "pqxpguz (22) -> tnpzf, zaxds, jvocm, eeluucp, zenvqu, ytqwzv\n" +
            "abfkpur (651) -> ppeumu, yuvpdk, kzimilx, wbwyvyu, dkwbhuk\n" +
            "khbth (270)\n" +
            "vpvab (76) -> evgvano, ibfbn, xovrzf, qzbet\n" +
            "iwotig (64)\n" +
            "nomlh (74)\n" +
            "oicxl (27)\n" +
            "gqjhcw (5)\n" +
            "cmfwb (18)\n" +
            "assqm (23)\n" +
            "tlyncze (36)\n" +
            "pqkzpq (35) -> gjpcufw, ocmac, hohsf, qdtdbl\n" +
            "zfxzq (58)\n" +
            "vhlon (80)\n" +
            "yiohbo (49) -> kwaqrgu, nezhs\n" +
            "tymahpb (87) -> ladkvis, rlrcvv, fciadzu, xpigis, kckucu, kdrswra, khbth\n" +
            "vcmntc (99)\n" +
            "beigkn (86)\n" +
            "pxzoq (16) -> mdimlja, hrufxbf, ufzrg\n" +
            "wuwag (65)\n" +
            "jdvya (385) -> zautz, haztq\n" +
            "jbxllu (22)\n" +
            "ashtupo (6)\n" +
            "xgdyhva (893) -> tkureky, solmej, yucxy\n" +
            "tooduon (92)\n" +
            "decdq (43)\n" +
            "ukhyz (95) -> ilnlkpv, bhzuzbt, agevvkl, byrfacr\n" +
            "pgscbge (77)\n" +
            "vdsjf (22)\n" +
            "zqdoieb (53)\n" +
            "sgtarpx (33)\n" +
            "yhiby (100) -> tzljrvn, ckezp\n" +
            "wdxfr (55)\n" +
            "owxgj (37)\n" +
            "uhmnltu (91)\n" +
            "lsbzpu (6)\n" +
            "ciwxuch (96)\n" +
            "qskbft (200)\n" +
            "gwwphk (79)\n" +
            "kbarp (60)\n" +
            "ygzas (55) -> ztyqti, nxapqfk\n" +
            "shifzsw (54)\n" +
            "huytmw (37) -> tsdfcgo, uqfbsti\n" +
            "atwtz (58)\n" +
            "ivcqfao (117) -> zqdoieb, bnmnak\n" +
            "wifwhkq (80)\n" +
            "ghtdnrx (1120) -> jcyxjwa, ftuvvv, nogbp\n" +
            "ztsajt (128) -> grvqyf, yxsvp\n" +
            "odmlf (60)\n" +
            "hocfv (70)\n" +
            "xegshds (53) -> upqkbq, hsdkmdv, ggxgmci, owjvny, gqiczm\n" +
            "efulo (213) -> lzcikn, tihjcht\n" +
            "jjkns (93)\n" +
            "fedhzki (61)\n" +
            "qtntw (294)\n" +
            "airlbu (71)\n" +
            "rzlkr (97)\n" +
            "ogujo (49)\n" +
            "jylgvd (165)\n" +
            "immcgrm (47)\n" +
            "hohsf (54)\n" +
            "knzffuc (11)\n" +
            "pwamvw (830) -> nvyaeal, tptcl, bbloz\n" +
            "nifptxs (90) -> zapbrn, vhxgbd, hmenje, hlzape, ugaxscf, fjemwxf, arnbvk\n" +
            "psvkj (81)\n" +
            "acsqtk (128) -> ykcivtj, bhcwhrf\n" +
            "ehgpqe (27)\n" +
            "knxtlig (57) -> lhqhx, alkysnc\n" +
            "sxino (50)\n" +
            "hwhgi (86)\n" +
            "glpwie (88) -> tzqux, uhwsavi, hfrtlx\n" +
            "mrkknr (34)\n" +
            "juxcxo (96)\n" +
            "pxpeniz (41)\n" +
            "buztc (76)\n" +
            "ewhzc (60)\n" +
            "bqpycy (253) -> snjfup, assqm\n" +
            "oynlkiy (25)\n" +
            "inful (168) -> knzffuc, ldgldpx\n" +
            "sybsbk (27)\n" +
            "towdptl (54)\n" +
            "yujhec (30) -> qkzgb, nmwrqbx, dktkg, rnbvott, etingr\n" +
            "nidvi (193) -> wjwit, dbuxj, rhpfhuc, ehyygbi\n" +
            "ttkqf (85)\n" +
            "iumsv (51)\n" +
            "ijvrlpz (95)\n" +
            "qqjvdh (76)\n" +
            "mwznhh (17)\n" +
            "ybwcod (63)\n" +
            "yulcus (24)\n" +
            "bcswm (96)\n" +
            "lfjpkw (216)\n" +
            "mjfhodb (18)\n" +
            "dbuxj (20)\n" +
            "ehyygbi (20)\n" +
            "lgdbaig (4976) -> lplhe, sznyfy, tjrecaq\n" +
            "odtgv (92)\n" +
            "falrf (97) -> zttpfsd, zfaog, sdezdnz\n" +
            "wyjnxf (12) -> bxipuq, ibosof\n" +
            "icdptj (42) -> onlnhb, ibqenc\n" +
            "lysysqu (237)\n" +
            "vltkp (33)\n" +
            "fwjufh (62)\n" +
            "uqkhzxt (60)\n" +
            "nbdfits (57)\n" +
            "mtsju (42) -> tzevrtu, wflxu\n" +
            "uxeyxk (88) -> ctmob, miwfyq, dtqyhj\n" +
            "krrxx (27)\n" +
            "tzevrtu (74)\n" +
            "tjmeqt (50) -> sinrdj, bbrsdwl\n" +
            "itzntrm (49)\n" +
            "ehjpn (291) -> opbaea, kvxtl\n" +
            "zayqjx (95) -> henlezn, vhpjrh\n" +
            "cvzsvf (15)\n" +
            "mmlsnw (63)\n" +
            "agwpt (84)\n" +
            "crfmd (70)\n" +
            "jjpnqsk (29)\n" +
            "otrlqy (56) -> hzbcp, qtcwngh\n" +
            "smkcc (147) -> yalqeoe, uzjoy\n" +
            "ztylsq (32)\n" +
            "dvzoq (17)\n" +
            "fyuitn (46) -> iumsv, fzmwc\n" +
            "zkiotrm (49)\n" +
            "ebhzgav (13) -> afooq, vihjl, xxoqrj, ipblpmy\n" +
            "wgtmwjd (682) -> lsoto, abqknn, uzlgko\n" +
            "kniivab (9) -> bymrwvc, aylzrt\n" +
            "oxrpu (63)\n" +
            "rsvcn (84)\n" +
            "hgbvgnn (96)\n" +
            "udlyr (227)\n" +
            "ktaso (28)\n" +
            "lmliqa (67)\n" +
            "rcpscka (117) -> eduizfz, sholtl\n" +
            "lzvpq (40)\n" +
            "sixlpmr (310) -> ttrvo, onsjs, ppujydt, zmuit, dfzbuxo\n" +
            "acibw (8)\n" +
            "ftpwtol (98) -> sstby, wduscx\n" +
            "pcfotkv (23) -> cszltz, pqdoti\n" +
            "eknyvq (97)\n" +
            "svxpx (66)\n" +
            "nhyhkq (68)\n" +
            "ttrvo (123) -> evpfdj, icdyfw\n" +
            "hlbhkkr (80)\n" +
            "bpuiaqr (96)\n" +
            "azykbk (80)\n" +
            "mnslyf (6) -> ouagp, wyjnxf, jxtzkel, vwtxaci, quxtc, yhiby, mgwiq\n" +
            "yfngcvd (59)\n" +
            "vfbhl (92)\n" +
            "fhcrud (62)\n" +
            "ggxgmci (66063) -> nsvan, qcbfbfz, anygv, gefrwix, kkeafw, jepbpw\n" +
            "dlcep (74)\n" +
            "aylzrt (67)\n" +
            "ghxwug (84)\n" +
            "auqfj (8)\n" +
            "kdajj (40)\n" +
            "wjjzh (96)\n" +
            "njnyoek (21)\n" +
            "lejuo (37)\n" +
            "abeinmv (961) -> tlfklor, izqbvna, sxpqvwv, foqjjt, xqusi\n" +
            "bkvaj (119) -> ktaso, ufqlean, czalivu\n" +
            "npwrqsm (33)\n" +
            "ysvbz (192) -> ekirg, lzvpq\n" +
            "unhnq (5580) -> rvkalxi, kabbsvt, jwptb\n" +
            "hqjlgre (47) -> jxxgurr, wvysxc\n" +
            "kpotsk (294)\n" +
            "nwand (344) -> vjtbtv, epnny, zdagr\n" +
            "xbxqoh (40)\n" +
            "ispeb (30)\n" +
            "lznlhjd (33) -> qqjvdh, ribswz, ndebha, vsojq\n" +
            "zlrboun (55)\n" +
            "ofxdo (93)\n" +
            "oxezpz (34)\n" +
            "uqfbsti (73)\n" +
            "zjljate (228) -> fzowmer, pcmgq\n" +
            "kbxvke (195)\n" +
            "uaxomk (87)\n" +
            "udawli (6) -> eiliwle, ijvrlpz\n" +
            "fnefss (348) -> qrtruk, ztsajt, aclnw\n" +
            "hbampcd (10)\n" +
            "czgws (57)\n" +
            "anygv (3678) -> tghfe, ybzqi, fabacam\n" +
            "qfxwzis (47)\n" +
            "ullsjlc (99)\n" +
            "yjarolt (69)\n" +
            "cfefqhk (84)\n" +
            "wflxu (74)\n" +
            "icroy (52)\n" +
            "ngkjtk (47)\n" +
            "oqsdfwt (43)\n" +
            "gswcnfo (93) -> gwnou, xedlv\n" +
            "mdznc (19)\n" +
            "zrdjlz (90)\n" +
            "btlczl (205) -> sjoxehw, ucrqw\n" +
            "xxyttn (228) -> dayjxl, melthx\n" +
            "qrunwtc (208) -> rzyuyv, gjisc, zrqzlvd, sqwtiaf, kgnuc, ufnpup, lfjpkw\n" +
            "hocvke (105) -> xzpov, btkih, kgijqnz\n" +
            "luswe (7)\n" +
            "whqrugy (77)\n" +
            "ikkatj (76)\n" +
            "hvdafm (590) -> gglig, nuorc, ioyesxg\n" +
            "kyjjz (210)\n" +
            "aqtgibg (84)\n" +
            "byrfacr (93)\n" +
            "tooqbdo (130) -> uaxsa, mcdpv, ccqsq\n" +
            "zbthq (88)\n" +
            "sboslk (27)\n" +
            "mwvihj (93)\n" +
            "ythbw (61)\n" +
            "kgnuc (76) -> iuzfnx, kylauj\n" +
            "xdnrao (194) -> wptxs, pdbtp\n" +
            "nszphks (60)\n" +
            "huyizg (24)\n" +
            "ujapot (76)\n" +
            "uycyz (2625) -> zzjwnh, ncirziy, icdptj\n" +
            "xuzskid (54)\n" +
            "xcvbgr (63)\n" +
            "macpvga (239) -> fdqmg, hyqrffw, rfytg, idnhoqh, dchobfa, kyjjz, aqahah\n" +
            "afrpf (29) -> ybbuy, uifanza\n" +
            "klqmcsw (185) -> zvzdrp, luswe\n" +
            "euglphc (165) -> jkyljso, abharn\n" +
            "heiejhm (48) -> ndyceo, nvoys\n" +
            "iulkkfp (112) -> pkwzp, cdzlq\n" +
            "ucrqw (73)\n" +
            "ivzps (58)\n" +
            "lyhgmwz (12)\n" +
            "ehwko (41)\n" +
            "hasbi (124)\n" +
            "pawmnl (91)\n" +
            "kbtogma (96)\n" +
            "dwwabne (6)\n" +
            "wjwit (20)\n" +
            "dktkg (232) -> ztuswk, iadezq, lhlyb\n" +
            "iimyku (59)\n" +
            "nlzohm (74)\n" +
            "owgrt (6) -> zpimcy, xconx\n" +
            "nyfdcz (61) -> zrdjlz, oevnzwt\n" +
            "crihz (75)\n" +
            "vehan (188)\n" +
            "ucocdl (11321) -> sixlpmr, yujhec, uryldo, bgltopb, tpreug, gwwjmo, pwamvw\n" +
            "urhawb (43)\n" +
            "ztyqti (71)\n" +
            "akmyzla (5)\n" +
            "hdtmmh (61)\n" +
            "vckxof (56) -> qpjgrr, lwejw\n" +
            "ctvhcv (21)\n" +
            "jdltlbx (92)\n" +
            "yxsvp (41)\n" +
            "xltlyvw (87)\n" +
            "fatxilu (17)\n" +
            "jljurl (14)\n" +
            "wfold (83) -> affnbx, fhcrud, gcfqnlw, fwjufh\n" +
            "mlavfvc (304)\n" +
            "mhwqim (70)\n" +
            "nemomq (62) -> jatrdb, nzrhtgr, ngyxxm, wnnnvgn, emlzcpy, haurusk, rynlaj\n" +
            "jdbmary (92)\n" +
            "icrilh (47) -> yolrh, cglbn\n" +
            "ybzqi (395) -> pcfotkv, ewifyk, uredmot\n" +
            "qvcpu (5)\n" +
            "qzbet (255) -> miunk, horfum\n" +
            "ckvji (42)\n" +
            "jpcurr (9)\n" +
            "stjxh (59)\n" +
            "kucnmn (50) -> incbyp, ogujo\n" +
            "vikstpo (80)\n" +
            "sdezdnz (20)\n" +
            "uticq (47)\n" +
            "yynji (85)\n" +
            "svnqa (313) -> nthqzh, uekit, hopiqm\n" +
            "xmufp (1476) -> cozhzk, xvjkwcd, yzjmm, jzsmrz, zuzkw\n" +
            "emdehy (42)\n" +
            "usixdl (84)\n" +
            "kgqhmx (27)\n" +
            "wjnibfh (12)\n" +
            "bvwdckm (47)\n" +
            "icoic (86)\n" +
            "aicos (78)\n" +
            "kabbsvt (1459) -> rwtva, wykyl\n" +
            "vuhehz (589) -> kdsmyax, tooqbdo, zizsy\n" +
            "lwbcn (64)\n" +
            "owjvny (68748) -> lgdbaig, yskay, uvftw\n" +
            "moxxiw (480) -> apyhkb, uakqow, tutfkbo, zmiyzin, hgwupie, thtnmkb\n" +
            "miunk (78)\n" +
            "tjrecaq (5) -> dzxkea, fsckdb, dreryps, svnqa, qfegd\n" +
            "twnon (66) -> ciwxuch, zpadu\n" +
            "fciadzu (152) -> rmnfq, tnxxb\n" +
            "pwmoihf (93)\n" +
            "vsbbr (61)\n" +
            "apyhkb (163) -> ixvot, dllffsl\n" +
            "dkwbhuk (1778) -> wavbwew, hlbhkkr\n" +
            "gnqxls (36)\n" +
            "dlglddh (98)\n" +
            "tlfklor (190) -> bwnvvei, thwgxk, thcth, gvphwwi\n" +
            "pwyspt (240)\n" +
            "eynrs (4953) -> gtvuq, vidgimw, fnefss, clmkbr, yxfysz, latvopy\n" +
            "ntfvgoj (97)\n" +
            "msxnd (45)\n" +
            "atwsafs (245)\n" +
            "incbyp (49)\n" +
            "ktiuc (1175) -> mzaxe, xxyttn, tmwvxgi, azcuz, szkgky, beaubot, ffvahj\n" +
            "hikmxhb (6)\n" +
            "ctmob (96)\n" +
            "zmiyzin (94) -> ryrig, sqwfq, mbpgrbi\n" +
            "gjauauy (12)\n" +
            "asymmuf (33) -> bwsbj, tfiynwo, zideon, xvkcms, jezdog, twnon, raloti\n" +
            "aoscisa (12) -> mnyokhx, ppigbow, eubqww\n" +
            "jbitbzb (54)\n" +
            "wwnkoz (62)\n" +
            "picati (50)\n" +
            "kmnmx (481)\n" +
            "lmdsuz (34)\n" +
            "nqohnyo (99)\n" +
            "rcvol (76)\n" +
            "ccqsq (27)\n" +
            "bsxjp (70) -> xcvbgr, gdidwas, hrhcwn\n" +
            "uakqow (237) -> advexy, zkvrxb\n" +
            "eckgtt (234) -> sofrfdv, nxygf, dbcrmjt\n" +
            "azcuz (64) -> vetib, jirva\n" +
            "hegyu (282) -> mfmrv, zwqpx, fyynsgp, hikmxhb\n" +
            "ppbvdzh (47)\n" +
            "snjfup (23)\n" +
            "yjlzh (23)\n" +
            "qcako (11)\n" +
            "lplhe (1375) -> qrklawm, avytp, fqrwf\n" +
            "gtyfx (110) -> vgvfksg, mmlsnw\n" +
            "jsdvowc (76)\n" +
            "beaubot (118) -> rscnige, dzjwel\n" +
            "wgvlq (23)\n" +
            "gjisc (192) -> liczn, lyhgmwz\n" +
            "jdqmr (10)\n" +
            "fjouck (19)\n" +
            "xreip (84)\n" +
            "ooeypdy (134) -> kgqhmx, vrvzkc\n" +
            "beiih (2781) -> wuwag, xbhexk\n" +
            "nroory (31)\n" +
            "hswdm (45)\n" +
            "kexrse (40)\n" +
            "ahracx (1289) -> mhgdq, homcnz\n" +
            "aksev (153) -> oqctx, cvzsvf\n" +
            "hmzal (155) -> hsael, wltyw\n" +
            "cldaf (97)\n" +
            "iscnnvh (606) -> fzzyjt, xtbqb, vyzhqx, owtdq\n" +
            "ibosof (98)\n" +
            "lhkoebz (67) -> jnenlog, jblnqb\n" +
            "slnoqn (21)\n" +
            "ulhmjq (34)\n" +
            "noqbv (8)\n" +
            "xeppuz (7)\n" +
            "fxpic (304)\n" +
            "gktepby (64)\n" +
            "gjkbf (67)\n" +
            "qaugj (61)\n" +
            "bbloz (51) -> icroy, rshqkfx\n" +
            "pjiicj (67)\n" +
            "ucqpz (39) -> dlglddh, tvhui\n" +
            "rwgpcs (57)\n" +
            "uzxovd (33)\n" +
            "jqougaa (59)\n" +
            "vrhke (93)\n" +
            "kkeafw (1602) -> gbcfg, uodmc, mnslyf\n" +
            "dcpqyp (6) -> soxzrwm, zxbirr\n" +
            "ceztn (37)\n" +
            "zwfly (18)\n" +
            "yfriw (59) -> xdvwjb, crfmd\n" +
            "gefbk (139) -> ivzps, atwtz\n" +
            "dpkdpj (126) -> mfyivv, aqtgibg\n" +
            "xpgzcxc (71)\n" +
            "rymvvbq (118) -> qjtldq, bawgh\n" +
            "bkpxd (20)\n" +
            "tqjmaxi (37)\n" +
            "phqyeg (90)\n" +
            "xnzhkrn (54)\n" +
            "niydyxq (33)\n" +
            "upqkbq (26244) -> dfnak, szsny, ehkrs, eynrs, cbpsyx, bbixr, zsckv\n" +
            "zcrgoy (17)\n" +
            "zuphhfa (199) -> ospcnv, pkagrvq\n" +
            "snhlzkk (428) -> iriyw, qdlcvk, mhium\n" +
            "qtcwngh (67)\n" +
            "jirva (92)\n" +
            "nyqju (66) -> nszphks, kbarp, guivwse, nnsogp\n" +
            "zdjxp (716) -> hhjdf, woiqeq, wfold\n" +
            "schym (20) -> fgyndgv, hlqed\n" +
            "ngyxxm (96) -> viqhzr, yylvwtf\n" +
            "woiqeq (149) -> jslpd, pfjvzzw\n" +
            "sthyxh (235)\n" +
            "xbhexk (65)\n" +
            "wnnnvgn (152) -> suqxa, wmhjbm\n" +
            "xzixh (71) -> wdnjs, hlzyncx\n" +
            "hwqhsc (235) -> akmyzla, tlekuus\n" +
            "bidasc (18)\n" +
            "pzbgmxx (156) -> vsevm, dwztnh, sybsbk\n" +
            "ckjdqr (49)\n" +
            "qdtdbl (54)\n" +
            "dvoul (816) -> yfriw, klqmcsw, ueepet\n" +
            "jkyljso (51)\n" +
            "ugqjxlt (43)\n" +
            "uazvt (57)\n" +
            "qovrrvg (172) -> eboizv, rrqfy\n" +
            "wgvxebc (62)\n" +
            "iwysxj (92)\n" +
            "gmtzu (30)\n" +
            "rwtva (64)\n" +
            "uulig (24) -> cqifjd, abjrozg, lgurkym, lznlhjd, lskrih\n" +
            "nefive (168) -> opkjkav, kyphnel\n" +
            "qsgjk (21)\n" +
            "kgpymt (18)\n" +
            "avytp (154) -> mdbixwm, mshht\n" +
            "yskay (47) -> asymmuf, gnjkpwf, tlmnwl, iyekup, rphgr, mfohmwu\n" +
            "mmyiwt (61)\n" +
            "wfilxtb (50)\n" +
            "iibjdbp (76)\n" +
            "amtxw (40)\n" +
            "ndyceo (86)\n" +
            "vbqsm (250) -> jdqmr, hbampcd\n" +
            "ttstqws (38)\n" +
            "ybbuy (87)\n" +
            "bfrmpr (101) -> dsjirbh, latvu\n" +
            "vagyecy (52)\n" +
            "rwlchj (73)\n" +
            "vdqpuon (868) -> pykcpw, yioxr, lcgym, wbijkw, dupdsj\n" +
            "zegoosj (36)\n" +
            "emcstpe (71)\n" +
            "pykcpw (168) -> bdkmsdy, mwznhh, zcrgoy\n" +
            "ymnichj (909) -> jfhpd, xvedp, phswa, udawli, tjmeqt\n" +
            "wlibbwd (5) -> nogjxu, bapvb, azykbk\n" +
            "bncsnst (12)\n" +
            "uxbnnor (76)\n" +
            "zbodhfq (56)\n" +
            "qhezs (93)\n" +
            "drhmhn (18)\n" +
            "hcfgf (197) -> tpfcmlm, xxxauxt, plcxnz\n" +
            "cbomeum (35)\n" +
            "qpjgrr (66)\n" +
            "dsjirbh (35)\n" +
            "lkoagx (58)\n" +
            "szsny (5431) -> yvbgs, lcepfsw, exfeog, rxxqpi, fuunnks\n" +
            "ytlzs (251) -> xnzhkrn, hezjirm, xuzskid, mwdqdbu\n" +
            "dzxkea (322) -> cwevfy, mepeg, bvnfacp, tygpx\n" +
            "xikuc (10)\n" +
            "rmnfq (59)\n" +
            "qfaubqr (82)\n" +
            "sauwet (445) -> bsieig, mrsxl\n" +
            "pdzfg (134) -> qfxwzis, ppbvdzh, rzwkjvu, sqwejs\n" +
            "quryyds (78) -> tfshhr, wdxfr\n" +
            "jvmuid (62)\n" +
            "cpwfem (93)\n" +
            "wratzd (22)\n" +
            "fhdkp (232) -> sbhcx, kdcyull, sikpe\n" +
            "agevvkl (93)\n" +
            "xadsoxv (71) -> whqrugy, fmlyuv, yerfxa\n" +
            "gvpac (51)\n" +
            "ipsfv (211) -> bkpxd, xivvpur\n" +
            "zprquyv (97) -> vrnxiui, htmrm\n" +
            "akobg (1607) -> vcsdacf, udfmh, ambgac\n" +
            "phxtzgu (78) -> exfffna, ewhzc, lufgbo, odmlf\n" +
            "rreoxyc (8)\n" +
            "jmmticn (24) -> chzrjqp, zhcmvvm, phqyeg\n" +
            "woxpci (80)\n" +
            "cvchqoz (24)\n" +
            "qxnuj (70)\n" +
            "tpfcmlm (20)\n" +
            "hewjj (263) -> dwwabne, iwhazt\n" +
            "adxox (79)\n" +
            "bxyvuvc (90)\n" +
            "opbaea (26)\n" +
            "xcbliim (404) -> wonyy, drhmhn, kgpymt\n" +
            "kzimilx (328) -> qmttkg, hpobvlt, pdzfg, zkborz, sbanx\n" +
            "mtvoxu (54)\n" +
            "qfggzok (67)\n" +
            "vxtfjhq (23)\n" +
            "hixeb (80)\n" +
            "bkvuz (73)\n" +
            "npozpo (98)\n" +
            "uqhnekk (17)\n" +
            "rhpfhuc (20)\n" +
            "ribswz (76)\n" +
            "mnyokhx (84)\n" +
            "oleuqo (43)\n" +
            "usbjyly (907) -> mjftixu, vldursw, ipsfv, pqkzpq, fkdauwn\n" +
            "nkbtsr (19)\n" +
            "szzhp (10)\n" +
            "hgwbjzo (83) -> pnhxqna, zxwmd\n" +
            "bubhosg (45)\n" +
            "lxxkjb (45)\n" +
            "yolrh (14)\n" +
            "cdzlq (96)\n" +
            "mbpgrbi (59)\n" +
            "lqvrx (85)\n" +
            "mmaqp (159) -> fsdlnh, ypmvfz\n" +
            "ekirg (40)\n" +
            "mdimlja (36)\n" +
            "cxynfb (183) -> wcqsimj, kwxpb, jprkymy, yjlzh\n" +
            "kgijqnz (55)\n" +
            "bapvb (80)\n" +
            "oqctx (15)\n" +
            "bemhni (51)\n" +
            "lcgym (199) -> anifo, eshjt\n" +
            "hopiqm (31)\n" +
            "ujdhkyw (136) -> yccqn, wfilxtb\n" +
            "ygbphkw (2416) -> eujnekp, utaxgw, jylgvd\n" +
            "occtbf (11)\n" +
            "vhdke (7) -> wqtbb, buztc, trzjoi, brubv\n" +
            "hpobvlt (186) -> lmdsuz, gumpsin, xpzzkdb, oxezpz\n" +
            "bdprpzc (38)\n" +
            "xcuid (26)\n" +
            "txayxeg (146) -> ngkjtk, uticq\n" +
            "ftuvvv (89) -> juxcxo, onmghy\n" +
            "vgysxct (103) -> cygpuh, svxpx\n" +
            "nxapqfk (71)\n" +
            "kylauj (70)\n" +
            "amyymhg (52)\n" +
            "jjpco (92)\n" +
            "mgmoe (45)\n" +
            "sinrdj (73)\n" +
            "rzclv (91)\n" +
            "ahcjog (59) -> yhhob, rvbbn, cawzw\n" +
            "saqcb (64)\n" +
            "cfmcrf (126) -> phmqb, xeppuz\n" +
            "uluavyz (311)\n" +
            "rzyuyv (182) -> uqhnekk, yqpivvl\n" +
            "ckezp (54)\n" +
            "ljihfp (71)\n" +
            "plcxnz (20)\n" +
            "uguqde (18)\n" +
            "scdvmta (40)\n" +
            "sofrfdv (28)\n" +
            "sahfob (87)\n" +
            "lzcikn (30)\n" +
            "gdidwas (63)\n" +
            "xqyyni (227) -> sjiaux, dwkkssy\n" +
            "yoibok (50)\n" +
            "wjgdz (54)\n" +
            "uifanza (87)\n" +
            "ufzrg (36)\n" +
            "kwxpb (23)\n" +
            "vmrdwe (13)\n" +
            "yucxy (65) -> mpedpht, jhzoyme\n" +
            "xuzvwcg (23) -> bluacvc, xcuid\n" +
            "wrbtgkb (45)\n" +
            "abqknn (142) -> kialkdr, xtqnalt\n" +
            "dklrle (46)\n" +
            "lhqbgck (632) -> ykcxtea, zjljate, ysvbz, qovrrvg\n" +
            "smzpa (114) -> jugwirf, ttborca, tmuuyka\n" +
            "fwoyu (86)\n" +
            "dgkhq (64)\n" +
            "tvhui (98)\n" +
            "clyht (10)\n" +
            "sspem (80)\n" +
            "pgpvnb (39)\n" +
            "zkborz (322)\n" +
            "liueudh (63)\n" +
            "myrlvj (63)\n" +
            "cszltz (51)\n" +
            "ambgac (34)\n" +
            "pwznn (120) -> cougztw, krrxx\n" +
            "iwhazt (6)\n" +
            "hgoruv (59)\n" +
            "gglig (156) -> saqcb, mubenp, vwqof\n" +
            "bwnvvei (50)\n" +
            "ezjgtbp (71)\n" +
            "xzkzoq (73) -> gtktonk, odtgv\n" +
            "qkzgb (219) -> ukkph, zrsya\n" +
            "cphgovc (269) -> nnqghfo, ohjvf\n" +
            "bdkmsdy (17)\n" +
            "hzbcp (67)\n" +
            "btkih (55)\n" +
            "ejyho (96)\n" +
            "ecagt (7)\n" +
            "vhxgbd (267) -> lkoagx, vrjfn, zfxzq\n" +
            "estka (47)\n" +
            "tihjcht (30)\n" +
            "tcaemi (171)\n" +
            "bnmnak (53)\n" +
            "jtendcr (85)\n" +
            "uekit (31)\n" +
            "jbpvbc (168) -> caukzx, pjiicj\n" +
            "pdbtp (91)\n" +
            "gjpcufw (54)\n" +
            "bvnfacp (21)\n" +
            "dqzsblu (91) -> wzlonwk, ywxkr, iggqobg, lydjsu\n" +
            "fjekad (48)\n" +
            "juzol (73)\n" +
            "dfzbuxo (17) -> fdrki, ufmlfmj, jxdqhu\n" +
            "dombfx (57) -> oxrpu, ybwcod\n" +
            "eidmza (481)\n" +
            "advexy (17)\n" +
            "ddleaoo (71)\n" +
            "bcyipmu (229) -> aflaj, cbomeum\n" +
            "rsttknu (97) -> bsxjp, bmzeddf, ndwvmg, glpwie, exbgy\n" +
            "tnham (76)\n" +
            "zideon (236) -> occtbf, hmltq\n" +
            "gfltww (51)\n" +
            "eduizfz (79)\n" +
            "fsdlnh (54)\n" +
            "jugwirf (51)\n" +
            "yylvwtf (98)\n" +
            "npefyxi (86)\n" +
            "gszlkf (30)\n" +
            "wptxs (91)\n" +
            "amntev (61)\n" +
            "hlqed (76)\n" +
            "rvbbn (81)\n" +
            "sygyji (6)\n" +
            "wcqsimj (23)\n" +
            "fjqccm (14455) -> tymahpb, ouycck, ehazo\n" +
            "gcfqnlw (62)\n" +
            "nnbokwt (194) -> mngea, hcajnu\n" +
            "bxipuq (98)\n" +
            "izqbvna (250) -> zoszls, kkoitqr\n" +
            "zxbirr (83)\n" +
            "nkipkdo (72)\n" +
            "yuvpdk (1257) -> gswcnfo, vceutc, kahwlj\n" +
            "eiliwle (95)\n" +
            "ohjvf (99)\n" +
            "cvkmmqc (54)\n" +
            "cdvscgo (44) -> tjmyc, phxtzgu, ayuhvb, eckgtt, wubltb\n" +
            "trzjoi (76)\n" +
            "zzdbn (50)\n" +
            "wonyy (18)\n" +
            "woxmeo (56)\n" +
            "enohjb (206) -> bkdxl, ttkqf\n" +
            "sznyfy (1243) -> xkfxnp, aoscisa, bbzhhk\n" +
            "phbapzv (50)\n" +
            "gkfymj (92) -> fbvhl, nkipkdo\n" +
            "hmltq (11)\n" +
            "kafyh (36) -> eincbt, amyymhg\n" +
            "pbkmeod (78) -> estka, ychaa\n" +
            "fgyndgv (76)\n" +
            "kunhp (19) -> rqpbivd, kdyuwjh\n" +
            "vruhp (227) -> woxpci, hixeb, sspem\n" +
            "jirnr (24)\n" +
            "kaekzo (48)\n" +
            "dsuonma (23)\n" +
            "xdxhzm (893) -> sncjicb, mmvhi, brchwcm, gefbk\n" +
            "bxpfs (92)\n" +
            "qdzbmhn (1640) -> xrabl, pwznn, dvzguq\n" +
            "aplke (19)\n" +
            "veuqzjh (25)\n" +
            "tpreug (377) -> axjkbq, hegyu, nyqju\n" +
            "fpmvb (17)\n" +
            "hlmdgp (78)\n" +
            "wbgwke (19)\n" +
            "dzjumb (43)\n" +
            "clmkbr (482) -> hasbi, pxzoq, ecfquya, coezio\n" +
            "affnbx (62)\n" +
            "ignblg (123) -> txeege, owxgj\n" +
            "ehqlqj (40)\n" +
            "vulynlf (18)\n" +
            "tghfe (89) -> usddqi, zuphhfa, rjzbhh\n" +
            "mdbixwm (33)\n" +
            "fdrki (60)\n" +
            "ggxhzhd (10) -> masck, amntev\n" +
            "obejsk (99)\n" +
            "eubqww (84)\n" +
            "auocy (60)\n" +
            "pqxef (50)\n" +
            "lhlyb (7)\n" +
            "tfiynwo (174) -> emdehy, zgtzox\n" +
            "jezdog (58) -> wvxvu, picati, tnisesh, yoibok\n" +
            "zizsy (89) -> hdtmmh, mmyiwt\n" +
            "ufmlfmj (60)\n" +
            "maklk (90)\n" +
            "oxvqjeh (17638) -> xscyb, wzjsbdm, lzikkl, xlyxjyx, flmeo, xcbliim\n" +
            "mmvhi (113) -> xpgzcxc, ddleaoo\n" +
            "yalqeoe (38)\n" +
            "ecfquya (32) -> vlfpib, dklrle\n" +
            "sagihe (940) -> bicpqwm, dyfptec, kbxvke, mgdhu\n" +
            "kiceppo (49)\n" +
            "tnpzf (114) -> ewrcce, jqougaa\n" +
            "vceutc (29) -> nqohnyo, vumxuur\n" +
            "uzdzkal (32)\n" +
            "csotuo (34)\n" +
            "xlufw (93)\n" +
            "hdqow (10132) -> uulig, macpvga, bkfxvy, zdjxp, akobg, vjboadc\n" +
            "rfqquyg (92)\n" +
            "sqwtiaf (30) -> aksgboa, qhezs\n" +
            "lamrqdl (59)\n" +
            "ittpbzy (101) -> jrkbskn, tqxfj\n" +
            "vjboadc (1160) -> dombfx, aksev, huytmw\n" +
            "iriyw (193) -> vxzgkqa, fjouck\n" +
            "hiftfo (88)\n" +
            "bsqlkiy (20)\n" +
            "hzkeiu (16)\n" +
            "arnbvk (329) -> zbodhfq, woxmeo\n" +
            "pxsmani (85)\n" +
            "jfapwfu (28) -> qhsptw, oqsdfwt, rsaitjm, decdq\n" +
            "jrkbskn (79)\n" +
            "zouqjoo (140)\n" +
            "wduscx (86)\n" +
            "vetib (92)\n" +
            "qtfroa (112) -> pxpeniz, ehwko, ujfmq\n" +
            "wgqnrc (30)\n" +
            "nvyaeal (29) -> mpijek, myrlvj\n" +
            "vsevm (27)\n" +
            "cdxwbv (23)\n" +
            "tzqux (57)\n" +
            "qkqgwsl (19)\n" +
            "ykcivtj (88)\n" +
            "tsdfcgo (73)\n" +
            "aqahah (68) -> airlbu, tgvqqn\n" +
            "jddzj (11)\n" +
            "zuzkw (16) -> sqfue, zlrboun\n" +
            "rdizbi (30)\n" +
            "lhxinfd (46)\n" +
            "sjiaux (15)\n" +
            "zfaog (20)\n" +
            "tgsdks (18)\n" +
            "dreryps (38) -> rfqquyg, jdltlbx, obqactw, hbgeak\n" +
            "xkfxnp (72) -> ejyho, hgbvgnn\n" +
            "qrtruk (63) -> ckjdqr, dtmhqm, tzdntld\n" +
            "mgwiq (16) -> wjjzh, kbtogma\n" +
            "sjoxehw (73)\n" +
            "jbpvtf (51)\n" +
            "gjtpl (48)\n" +
            "hrhcwn (63)\n" +
            "igkso (40) -> tqfzh, gbhlxb\n" +
            "cygpuh (66)\n" +
            "fckfbce (105) -> jtendcr, fcutr\n" +
            "yerfxa (77)\n" +
            "vjtbtv (77) -> unmxfe, rzclv\n" +
            "ppujydt (23) -> pujhjf, lvwwxt\n" +
            "qmvpgee (97)\n" +
            "kdrswra (102) -> xreip, ghxwug\n" +
            "oablvt (87)\n" +
            "latvopy (38) -> smmnc, quryyds, vyptki, hgchigs, vckxof\n" +
            "uaxsa (27)\n" +
            "lissl (97)\n" +
            "xovrzf (331) -> ehqlqj, scdvmta\n" +
            "homcnz (62)\n" +
            "crsjegg (21) -> iooqbyk, qrunwtc, bumibye, lhqbgck, sagihe, vpvab\n" +
            "pkagrvq (14)\n" +
            "thcth (50)\n" +
            "nogjxu (80)\n" +
            "hhjdf (207) -> wgvxebc, jvmuid\n" +
            "ipblpmy (46)\n" +
            "qmttkg (94) -> ohohls, zxdpmwl, czgws, ydbzo\n" +
            "qjtldq (7)\n" +
            "iggqobg (65)\n" +
            "hhfgih (152) -> wratzd, vdsjf, tbynt, hlzzxi\n" +
            "xvjkwcd (40) -> oleuqo, urhawb\n" +
            "fabacam (305) -> dlcxjg, dlactl, falrf\n" +
            "xvrgg (77)\n" +
            "fshoj (23)\n" +
            "uredmot (55) -> zmjzmyq, ghnldf\n" +
            "psynxr (19)\n" +
            "dtiprc (61)\n" +
            "pevdihc (135) -> rbmoj, hiftfo\n" +
            "jxtzkel (132) -> bdprpzc, ptfeyky\n" +
            "uvftw (1277) -> hvdafm, xgdyhva, vvndbk, gwkfb, cdvscgo, lhagpts\n" +
            "jvocm (114) -> lamrqdl, stjxh\n" +
            "zgtzox (42)\n" +
            "fzmwc (51)\n" +
            "aopwj (77)\n" +
            "vgeln (89)\n" +
            "nvwknv (47)\n" +
            "vrvzkc (27)\n" +
            "sholtl (79)\n" +
            "guivwse (60)\n" +
            "gjbikl (12)\n" +
            "kdsmyax (51) -> vhlon, vikstpo\n" +
            "dyqgl (50)\n" +
            "uqjsosg (67)\n" +
            "kahwlj (79) -> nlzohm, nomlh\n" +
            "lqgvx (97)\n" +
            "sstby (86)\n" +
            "sgcmty (77)\n" +
            "hgchigs (34) -> djktoc, aopwj\n" +
            "ouagp (24) -> lcfpcst, bxpfs\n" +
            "tsahe (106) -> gjkbf, uqjsosg\n" +
            "psjbb (86)\n" +
            "vrjfn (58)\n" +
            "rjzbhh (91) -> sarppfb, nhyhkq\n" +
            "melthx (10)\n" +
            "nuorc (40) -> ytlpe, fvhfru, xvrgg, kbdbe\n" +
            "mubenp (64)\n" +
            "mqtxqmz (12) -> lqvrx, chczyg\n" +
            "ypmvfz (54)\n" +
            "txote (73)\n" +
            "vxzgkqa (19)\n" +
            "bbrsdwl (73)\n" +
            "xconx (83)\n" +
            "enlfaa (479) -> djquz, sthyxh, hkuay, hmdqubz, qxccjtw, vgysxct\n" +
            "wbwyvyu (13) -> hmzal, fckfbce, fqdtzfy, hgwbjzo, hewjj, rcpscka, cxynfb\n" +
            "cvrph (145) -> dbdrdzo, acdahz\n" +
            "izsgfu (64)\n" +
            "jcexcl (18)\n" +
            "oacoxb (1336) -> msazzkr, jbpvht\n" +
            "acdahz (83)\n" +
            "afooq (46)\n" +
            "fkdauwn (187) -> aynknet, uzdzkal\n" +
            "mpedpht (91)\n" +
            "lcepfsw (218) -> schym, pbkmeod, ntodfz, owgrt, dcpqyp\n" +
            "xscyb (458)\n" +
            "pujhjf (87)\n" +
            "jtankmh (190)\n" +
            "pxctb (71)\n" +
            "tqfzh (75)\n" +
            "jzsmrz (126)\n" +
            "nzrhtgr (150) -> ezjgtbp, xfxsxh\n" +
            "tnxfqf (34)\n" +
            "djquz (211) -> fwlme, lsbzpu, ashtupo, gbauyfh\n" +
            "jyhddhe (49)\n" +
            "wdnjs (85)\n" +
            "byaaoab (186) -> ikhsv, pgpvnb\n" +
            "bumibye (997) -> xzixh, kdsbbcf, nyfdcz\n" +
            "frffchv (33)\n" +
            "cogziqp (12)\n" +
            "brchwcm (27) -> uxbnnor, iibjdbp, qupaz\n" +
            "fbvvzp (304)\n" +
            "tnisesh (50)\n" +
            "henlezn (64)\n" +
            "kbdbe (77)\n" +
            "vojpfo (43)\n" +
            "psxqu (61)\n" +
            "fvzfdr (52)\n" +
            "rvkalxi (77) -> vlzbp, jbpvbc, muvvvu, xadsoxv, ahcjog\n" +
            "abharn (51)\n" +
            "gegdmus (42)\n" +
            "hfdjtw (43)\n" +
            "zoqmn (54)\n" +
            "vgwxuan (50)\n" +
            "pjukxu (76) -> ikkatj, ujapot, rcvol\n" +
            "oziwd (8)\n" +
            "evgvano (411)\n" +
            "evquf (195)\n" +
            "gkjafru (18)\n" +
            "ygwxr (144) -> ylpvre, cabbtti\n" +
            "dniumoe (83) -> wajnp, mtvoxu, towdptl, kmiax\n" +
            "tlekuus (5)\n" +
            "mrchmw (43) -> xssia, wifwhkq\n" +
            "ueepet (113) -> ugoetwf, hfdjtw\n" +
            "znzsgk (98)\n" +
            "cabbtti (48)\n" +
            "cbpsyx (1290) -> nifptxs, oxzecjg, uycyz\n" +
            "ulqnjx (18)\n" +
            "ezjqb (49)\n" +
            "xvkcms (212) -> vxtfjhq, imjhra\n" +
            "kxgrtg (61)\n" +
            "hxtbym (50)\n" +
            "pqdoti (51)\n" +
            "lizkruo (15)\n" +
            "zzjwnh (130) -> ehgpqe, oicxl\n" +
            "mzbwym (39)\n" +
            "nkixmeh (32)\n" +
            "xxxauxt (20)\n" +
            "caukzx (67)\n" +
            "zenvqu (124) -> sboslk, fwudfax, rlbdave, onqnmbp\n" +
            "ivyarjy (46)\n" +
            "ldgldpx (11)\n" +
            "grvqyf (41)\n" +
            "hlzzxi (22)\n" +
            "jsvwb (10)\n" +
            "cglbn (14)\n" +
            "swefql (99)\n" +
            "zgtsnwk (63)\n" +
            "hlzape (373) -> fatxilu, htyvy, fpmvb, xxufma\n" +
            "lqylns (82) -> inful, igkso, mtsju, otrlqy, jtankmh, vorviq\n" +
            "iouzha (161) -> slnoqn, gmmkqp\n" +
            "kwtszff (119) -> bkfqmqn, tbsmz\n" +
            "rqpbivd (92)\n" +
            "bupugpv (36)\n" +
            "zaxds (66) -> ygywjq, pusxipi\n" +
            "onmghy (96)\n" +
            "jnenlog (78)\n" +
            "sovfoi (97) -> uluavyz, vhdke, kuivtq, ylluriq, cvrph, pevdihc\n" +
            "cfcbhku (90)\n" +
            "tgvqqn (71)\n" +
            "ncirziy (48) -> ulhmjq, zwoqof, hrzvmel, vrbss\n" +
            "obqactw (92)\n" +
            "udfmh (34)\n" +
            "hgsiz (46)\n" +
            "bicpqwm (177) -> sygyji, bjfou, qsche\n" +
            "jslpd (91)\n" +
            "pcmgq (22)\n" +
            "graedp (89) -> npozpo, znzsgk, jxvses, teikos\n" +
            "pnhxqna (96)\n" +
            "cwwdl (73)\n" +
            "msazzkr (28)\n" +
            "mngea (23)\n" +
            "gohxocn (23)\n" +
            "qfqnrvt (4602) -> ptwedjj, xdxhzm, qsiqu\n" +
            "rsaitjm (43)\n" +
            "lwroef (37)\n" +
            "jbpvht (28)\n" +
            "wjovhv (35) -> gokngb, vczph, phbapzv, tqcwn\n" +
            "nsabyg (99)\n" +
            "tvbswr (45)\n" +
            "fwbly (134) -> dzjumb, ugqjxlt\n" +
            "hrufxbf (36)\n" +
            "wltyw (60)\n" +
            "ptfeyky (38)\n" +
            "jwptb (1539) -> yulcus, ndvns\n" +
            "qxccjtw (178) -> wbgwke, arqqbb, qkqgwsl\n" +
            "ewrcce (59)\n" +
            "oxzecjg (2983) -> eknyvq, myypsh\n" +
            "dwkkssy (15)\n" +
            "gnxiznu (126) -> nroory, loofhh\n" +
            "bejncv (38)\n" +
            "qcbfbfz (2322) -> vuhehz, lqylns, wgtmwjd\n" +
            "pkwzp (96)\n" +
            "owtdq (103) -> frffchv, lkzdum, sgtarpx\n" +
            "mdauzot (240)\n" +
            "alkysnc (73)\n" +
            "gtvuq (898) -> zuapfco, kexrse\n" +
            "eewbbvo (70)\n" +
            "jfhpd (196)\n" +
            "mshht (33)\n" +
            "sbanx (204) -> fhabfp, yfngcvd\n" +
            "pusxipi (83)\n" +
            "mwbvrhn (182)\n" +
            "fbvhl (72)\n" +
            "ulvmck (1649) -> bfrmpr, tcaemi, gkvrrq\n" +
            "yproaz (18)\n" +
            "bgltopb (866) -> bpbik, kniivab, quyasfd\n" +
            "nnkpuhp (65)\n" +
            "bhzuzbt (93)\n" +
            "tcbrhdi (87)\n" +
            "guzycwt (34)\n" +
            "jdabb (61)\n" +
            "fsckdb (268) -> yjarolt, dewtepm\n" +
            "yfkyv (45)\n" +
            "hyqrffw (146) -> ztylsq, nkixmeh\n" +
            "ctkjip (87)\n" +
            "vularzu (93)\n" +
            "ygywjq (83)\n" +
            "xzjcf (1843) -> mmaqp, euglphc, smzpa, zprquyv\n" +
            "jblnqb (78)\n" +
            "dbcrmjt (28)\n" +
            "dewtepm (69)\n" +
            "zdagr (249) -> gqjhcw, qvcpu\n" +
            "jepbpw (383) -> tgwmbza, wifvw, nwand, tyjrdme, snhlzkk\n" +
            "duxfof (39)\n" +
            "tzljrvn (54)\n" +
            "smmnc (20) -> agwpt, cfefqhk\n" +
            "vgvfksg (63)\n" +
            "ugaxscf (289) -> vtneuhy, bfcab\n" +
            "tbynt (22)\n" +
            "hkuay (121) -> bejncv, fpqpmca, ttstqws\n" +
            "eujnekp (7) -> licby, adxox\n" +
            "exfeog (853) -> crihz, xuzvwcg, icrilh\n" +
            "gmmkqp (21)\n" +
            "qfegd (228) -> vgeln, zdrwxqt\n" +
            "lewizr (39)\n" +
            "teikos (98)\n" +
            "bwsbj (216) -> xrwnzgz, hydfd\n" +
            "frzwdkn (11)\n" +
            "fgokr (19)\n" +
            "cwevfy (21)\n" +
            "dzekyo (43)\n" +
            "tmuuyka (51)\n" +
            "njppj (23)\n" +
            "eboizv (50)\n" +
            "gvphwwi (50)\n" +
            "vidgimw (534) -> dsstjf, fyuitn, kucnmn\n" +
            "wmhjbm (70)\n" +
            "zkvrxb (17)\n" +
            "gwnou (67)\n" +
            "pihpjbp (14)\n" +
            "lwejw (66)\n" +
            "fmlyuv (77)\n" +
            "rtstdkd (47)\n" +
            "kmiax (54)\n" +
            "vyptki (98) -> mgmoe, msxnd\n" +
            "gwkfb (1238) -> ggxhzhd, rymvvbq, wvwiwua\n" +
            "wvwiwua (108) -> wjnibfh, exiwwbx\n" +
            "shilhu (67)\n" +
            "bpbik (97) -> cdxwbv, zchxtxj\n" +
            "hssgk (14)\n" +
            "hujzcku (44)\n" +
            "tjmyc (258) -> gmtzu, rdizbi\n" +
            "vhjfcw (191) -> yproaz, tgsdks\n" +
            "ewzvs (54)\n" +
            "qsche (6)\n" +
            "rxwtoee (30)\n" +
            "muvvvu (167) -> gbkubnt, lxxkjb, vjdrrnk\n" +
            "sbhcx (48)\n" +
            "vvndbk (953) -> jgwvyp, udlyr, vhjfcw\n" +
            "nnqghfo (99)\n" +
            "coezio (70) -> jcexcl, woeabie, uguqde\n" +
            "zchxtxj (23)\n" +
            "rfytg (142) -> oldfs, mrkknr\n" +
            "ndtsa (7)\n" +
            "qrklawm (78) -> emcstpe, pxctb\n" +
            "ladkvis (99) -> nbdfits, uazvt, rwgpcs\n" +
            "ewiugad (167) -> uzxovd, vltkp, niydyxq, yxknolf\n" +
            "yioxr (150) -> njppj, inpjzmh, nbfpp\n" +
            "exfffna (60)\n" +
            "rrqfy (50)\n" +
            "sdwnkb (93)\n" +
            "rshqkfx (52)\n" +
            "fvhfru (77)\n" +
            "tutfkbo (187) -> ckvji, gegdmus\n" +
            "vlfpib (46)\n" +
            "lsoto (148) -> fwjnm, hzkeiu\n" +
            "ecxayrz (63) -> wutzd, vbqsm, nefive, ftpwtol, hocvke\n" +
            "urexzjf (187) -> wxyhyh, vojpfo\n" +
            "nbfpp (23)\n" +
            "rspilzk (40)\n" +
            "zgatapc (49)\n" +
            "vcsdacf (34)\n" +
            "rnvenxi (36)\n" +
            "mcdpv (27)\n" +
            "oieuzv (25)\n" +
            "txtnweq (67)\n" +
            "sarppfb (68)\n" +
            "wpxxz (20) -> fedhzki, vsbbr, psxqu, jdabb\n" +
            "usglf (78)\n" +
            "ujfmq (41)\n" +
            "fpqpmca (38)\n" +
            "yxknolf (33)\n" +
            "ppeumu (517) -> mrchmw, bkvaj, iouzha, knxtlig, jdvro, afrpf, kunhp\n" +
            "acueoez (86)\n" +
            "foqjjt (294) -> fjekad, gjtpl\n" +
            "dyfptec (105) -> ispeb, wgqnrc, rxwtoee\n" +
            "idnhoqh (70) -> mzftrlb, qxnuj\n" +
            "vrnxiui (85)\n" +
            "tgwmbza (1064) -> aplke, tqnqxx, nkbtsr\n" +
            "mhgdq (62)\n" +
            "yccqn (50)\n" +
            "bbixr (4503) -> xmufp, moxxiw, nemomq\n" +
            "aynknet (32)\n" +
            "cdrjh (64)\n" +
            "hgwupie (115) -> aicos, zziuivt\n" +
            "fwjnm (16)\n" +
            "qhsptw (43)\n" +
            "ptwedjj (33) -> xdnrao, enohjb, uxeyxk, qxzhq, fhdkp\n" +
            "jxvses (98)\n" +
            "xvedp (50) -> cwwdl, rwlchj\n" +
            "jxxgurr (95)\n" +
            "etingr (217) -> ulqnjx, vulynlf\n" +
            "bsieig (18)\n" +
            "mhium (203) -> hssgk, jljurl\n" +
            "vlzbp (286) -> auqfj, noqbv\n" +
            "suqxa (70)\n" +
            "dlcxjg (17) -> mhwqim, jcrmny\n" +
            "xpigis (270)\n" +
            "ehkrs (11) -> ulvmck, dhujegl, fngfnuz, qdzbmhn, usbjyly\n" +
            "xxoqrj (46)\n" +
            "rscnige (65)\n" +
            "dhujegl (34) -> mlavfvc, fxpic, fbvvzp, qinwdk, acsqtk, pjukxu, iulkkfp\n" +
            "qgufw (74)\n" +
            "cznqutl (99)\n" +
            "evpfdj (37)\n" +
            "pfjvzzw (91)\n" +
            "ffvahj (47) -> qdxpkx, vmvjl, qfggzok\n" +
            "yfouoak (56) -> vfbhl, jjpco\n" +
            "qntqokn (8)\n" +
            "kebefwy (246) -> jguhhsb, jpcurr\n" +
            "hbozym (48)\n" +
            "infll (59)\n" +
            "wvysxc (95)\n" +
            "ospcnv (14)\n" +
            "nvoys (86)\n" +
            "efvvtgo (185) -> zegoosj, tlyncze\n" +
            "lhqhx (73)\n" +
            "yqpivvl (17)\n" +
            "hcajnu (23)\n" +
            "tgtjhg (25)\n" +
            "viqhzr (98)\n" +
            "yygyfi (155) -> jddzj, qcako, frzwdkn\n" +
            "yzjmm (36) -> ldakuz, fivaym\n" +
            "kialkdr (19)\n" +
            "gdibw (12)\n" +
            "rdngdrd (80)\n" +
            "lgurkym (337)\n" +
            "ddsmt (87)\n" +
            "rkdopb (82) -> todbu, sahfob, uaxomk\n" +
            "xslucv (51)\n" +
            "bfcab (76)\n" +
            "gnjkpwf (947) -> zayqjx, smkcc, lhkoebz, ivcqfao\n" +
            "iadezq (7)\n" +
            "ckgmjsg (44)\n" +
            "tqxfj (79)\n" +
            "nmwrqbx (55) -> obejsk, nsabyg\n" +
            "mepeg (21)\n" +
            "iuzfnx (70)\n" +
            "bfphqmo (99)\n" +
            "myypsh (97)\n" +
            "ykcxtea (86) -> cpwfem, vularzu\n" +
            "yhhob (81)\n" +
            "fcutr (85)\n" +
            "rjfqyz (71) -> rfvtfs, xlufw\n" +
            "ryrig (59)\n" +
            "fzzyjt (202)\n" +
            "tyjrdme (321) -> zngystc, jfapwfu, qskbft, pvqfa\n" +
            "ywxkr (65)\n" +
            "vjdrrnk (45)\n" +
            "tptcl (61) -> krxpma, rtstdkd\n" +
            "tnxxb (59)\n" +
            "zrsya (17)\n" +
            "jprkymy (23)\n" +
            "icdyfw (37)\n" +
            "iovan (1882) -> wppgjkw, rkdopb, ehjpn\n" +
            "qeijcl (12)\n" +
            "izfqx (47)\n" +
            "mwdqdbu (54)\n" +
            "txeege (37)\n" +
            "onqnmbp (27)\n" +
            "isuevmr (221) -> sphktgz, gjauauy, bncsnst\n" +
            "ohohls (57)\n" +
            "kwaqrgu (94)\n" +
            "mfmrv (6)\n" +
            "dzjwel (65)\n" +
            "ibfbn (75) -> hquuw, sreeeqf, usixdl, rsvcn\n" +
            "uzjoy (38)\n" +
            "jhzoyme (91)\n" +
            "loyjp (62)\n" +
            "vazst (45) -> ymfwoto, hxtbym, lfszf\n" +
            "jkhruz (15)\n" +
            "ioyesxg (132) -> wjgdz, cvkmmqc, shifzsw, zoqmn\n" +
            "veyvaoh (7)\n" +
            "cpoxc (217) -> wqobawc, shilhu\n" +
            "zvzdrp (7)\n" +
            "hydfd (21)\n" +
            "tygpx (21)\n" +
            "juvwvsn (53)\n" +
            "phswa (176) -> xikuc, clyht\n" +
            "fhhzvwj (20)\n" +
            "vldursw (145) -> rsjmc, juvwvsn\n" +
            "ocmac (54)\n" +
            "dchobfa (12) -> ullsjlc, cznqutl\n" +
            "onlnhb (71)\n" +
            "ftolbk (183) -> pagsex, wrbtgkb\n" +
            "flrdpaj (92)\n" +
            "vmvjl (67)\n" +
            "kqcog (48) -> bcswm, bpuiaqr\n" +
            "cstnc (79) -> bubhosg, tvbswr, hswdm, yfkyv\n" +
            "vuazmuj (23)\n" +
            "eincbt (52)\n" +
            "wzjsbdm (62) -> sytjgl, tfuuzgi, bfphqmo, vcmntc\n" +
            "dvyohbc (85)\n" +
            "zwoqof (34)\n" +
            "wqtbb (76)\n" +
            "gkvrrq (77) -> izfqx, bvwdckm\n" +
            "xivvpur (20)\n" +
            "jxzyc (141) -> nvwknv, immcgrm\n" +
            "ufqlean (28)\n" +
            "todbu (87)\n" +
            "qdmop (85)\n" +
            "thtnmkb (95) -> adjfke, zbthq\n" +
            "ikzqhu (50)\n" +
            "jcyxjwa (98) -> agjdl, dtiprc, qaugj\n" +
            "horfum (78)\n" +
            "dayjxl (10)\n" +
            "vczph (50)\n" +
            "alpas (17) -> dgkhq, izsgfu, gktepby, iwotig\n" +
            "dqrsxx (81)\n" +
            "ixvot (54)\n" +
            "hoagrj (99)\n" +
            "dwztnh (27)\n" +
            "uodmc (727) -> atwsafs, hwqhsc, wlibbwd\n" +
            "dqyaco (32)\n" +
            "bkfqmqn (70)\n" +
            "dlactl (127) -> jkhruz, lizkruo\n" +
            "kuivtq (311)\n" +
            "wkkqsy (80)\n" +
            "szkgky (76) -> psjbb, beigkn\n" +
            "wutzd (168) -> guzycwt, tnxfqf, csotuo\n" +
            "rlrcvv (128) -> hkelse, ljihfp\n" +
            "vtneuhy (76)\n" +
            "exbgy (159) -> veuqzjh, oynlkiy, oieuzv, tgtjhg\n" +
            "bjrfinh (97)\n" +
            "hsdkmdv (50286) -> unhnq, crsjegg, abfkpur, qfqnrvt, etsxvmj\n" +
            "masck (61)\n" +
            "vrbss (34)\n" +
            "ytqwzv (68) -> qfaubqr, fyxdfod\n" +
            "kvxtl (26)\n" +
            "ibqenc (71)\n" +
            "zsckv (6579) -> iscnnvh, pqxpguz, wqudy\n" +
            "splhdhe (80)\n" +
            "raloti (104) -> sgcmty, pgscbge\n" +
            "sreeeqf (84)\n" +
            "tqnqxx (19)\n" +
            "xaskpny (79)\n" +
            "gbauyfh (6)\n" +
            "exiwwbx (12)\n" +
            "phmqb (7)\n" +
            "bydmdru (60)\n" +
            "zwqpx (6)\n" +
            "ehazo (1097) -> heiejhm, fwbly, gyivxga, wjhgb\n" +
            "zudhbe (168) -> ndtsa, ecagt\n" +
            "fncsm (46)\n" +
            "zhkmnxk (21) -> ytlzs, ukhyz, cphgovc, vruhp\n" +
            "cqifjd (189) -> knsphtv, qgufw\n" +
            "vcllnn (244) -> dkbycez, jxzyc, qtfroa, ucqpz, wjovhv, pxfpf, orawnkw\n" +
            "arqqbb (19)\n" +
            "dsstjf (100) -> cvchqoz, jirnr\n" +
            "bjfou (6)\n" +
            "gokngb (50)\n" +
            "qupaz (76)\n" +
            "opkjkav (51)\n" +
            "fgayln (257)\n" +
            "jzdtwf (7)\n" +
            "dbdrdzo (83)\n" +
            "sytjgl (99)\n" +
            "nthqzh (31)\n" +
            "ndwvmg (235) -> qeijcl, kyhace\n" +
            "gwwjmo (575) -> mdauzot, yfouoak, qkrirn\n" +
            "evofb (24)\n" +
            "ugoetwf (43)\n" +
            "zrqzlvd (42) -> eavfy, tcbrhdi\n" +
            "djyks (81)\n" +
            "gwsceo (9) -> beiih, guipj, xzjcf, ktiuc, iovan, ygbphkw, abeinmv\n" +
            "qdlcvk (61) -> dvyohbc, yynji\n" +
            "lvwwxt (87)\n" +
            "fngfnuz (1222) -> vehan, yygyfi, vpnfkw, gnxiznu, ooeypdy\n" +
            "dfnak (6645) -> cxfvbz, oacoxb, rsttknu\n" +
            "pftmymi (13)\n" +
            "ikhsv (39)\n" +
            "quyasfd (63) -> xbxqoh, kdajj\n" +
            "ntodfz (172)\n" +
            "krxpma (47)\n" +
            "xpzzkdb (34)\n" +
            "dtmhqm (49)\n" +
            "hquuw (84)\n" +
            "tfuuzgi (99)\n" +
            "rbmoj (88)\n" +
            "tfshhr (55)\n" +
            "nxygf (28)\n" +
            "wvxvu (50)\n" +
            "chczyg (85)\n" +
            "djktoc (77)\n" +
            "ttborca (51)\n" +
            "pvcpmx (137) -> jjpnqsk, gseohkk\n" +
            "fwudfax (27)\n" +
            "vyzhqx (62) -> eewbbvo, hocfv\n" +
            "dvzguq (140) -> ulzcu, dvzoq\n" +
            "rhwfl (74)\n" +
            "mfohmwu (344) -> dniumoe, uuimn, ewiugad, vkkds, bqpycy\n" +
            "lskrih (177) -> splhdhe, rdngdrd\n" +
            "vihjl (46)\n" +
            "adjfke (88)\n" +
            "brubv (76)\n" +
            "rzwkjvu (47)\n" +
            "iyekup (1248) -> ignblg, ebhzgav, ygzas\n" +
            "uryldo (749) -> mqtxqmz, mwbvrhn, zudhbe\n" +
            "vorviq (176) -> jzdtwf, veyvaoh\n" +
            "vsojq (76)\n" +
            "ilnlkpv (93)\n" +
            "tzdntld (49)\n" +
            "tuefd (209) -> kqcog, hhfgih, nnbokwt, pwyspt, txayxeg, tsahe, ygwxr\n" +
            "bmzeddf (259)\n" +
            "sqfue (55)\n" +
            "ndebha (76)\n" +
            "ulzcu (17)\n" +
            "tlmnwl (474) -> nidvi, alpas, urexzjf, ftolbk, efulo\n" +
            "thwgxk (50)\n" +
            "soxzrwm (83)\n";

    private static String test = "pbga (66)\n" +
            "xhth (57)\n" +
            "ebii (61)\n" +
            "havc (66)\n" +
            "ktlj (57)\n" +
            "fwft (72) -> ktlj, cntj, xhth\n" +
            "qoyq (66)\n" +
            "padx (45) -> pbga, havc, qoyq\n" +
            "tknk (41) -> ugml, padx, fwft\n" +
            "jptl (61)\n" +
            "ugml (68) -> gyxo, ebii, jptl\n" +
            "gyxo (61)\n" +
            "cntj (57)";

    public static void main(String[] args) {
        System.out.println("\nAnswer=" + new Day7().process(input));
    }

    private String process(String input) {
        HashMap<String, Structure> towerOfPrograms = new HashMap<>();
        String[] towers = input.split("\n");

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

        String rootTowerName = "NOT_FOUND";
        for (Structure tower : towerOfPrograms.values()) {
            if (tower.getParent() == null) {
                rootTowerName = tower.getName();
                break;
            }
        }

        findBalance(towerOfPrograms.get(rootTowerName));

        return rootTowerName;
    }

    private Structure buildStructure(String tower) {
        String[] programs = tower.split(" ");

        Structure structure = new Structure(programs[0], Integer.parseInt((programs[1].replace('(', ' ').replace(')', ' ')).trim()));

        if (programs.length > 2) {
            for (int i = 3; i < programs.length; i++) {
                structure.addLinkName(programs[i].replace(',', ' ').trim());
            }
        }
        return structure;
    }

//    private void findBalance2(Structure structure) {
//        int stableValue = 0;
//        int diffValue = 0;
//        Structure oddChild = null;
//
//        for (Structure child : structure.getLinks().values()) {
//            int stackWeight = child.getWeight() + calcChildWeight(child);
//            System.out.println(stackWeight);
//
//            if (stableValue == 0) {
//                stableValue = stackWeight;
//            } else if (stackWeight > stableValue) {
//                oddChild = child;
//                diffValue = stackWeight - stableValue;
//                stableValue = stackWeight;
//            }
//        }
//
//        if (oddChild != null) {
//            System.out.println(oddChild.getName() + " Was="+oddChild.getWeight()+", Now="+(oddChild.getWeight()-diffValue));
//        }
//    }

    private int calcChildWeight(Structure structure) {
        int totalWeight = 0;
        for(Structure child : structure.getLinks().values()) {
            totalWeight += child.getWeight() + calcChildWeight(child);
        }
        return totalWeight;
    }

    private int findBalance(Structure structure) {
//        int totalStackValue = structure.getWeight();
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
                Integer i = e.get(stackWeight)+1;
                e.put(stackWeight, i);
            }
//            totalStackValue += stackWeight;
//            System.out.println(totalStackValue);
//            System.out.println(stackWeight);

//            if (stableValue == 0) {
//                stableValue = stackWeight;
//            } else if (stackWeight > stableValue) {
//                oddChild = child;
//                diffValue = stackWeight - stableValue;
//                stableValue = stackWeight;
//            }
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
                }
                else if (e.get(key) < ck) {
                    ck = e.get(key);
                    odCk = key;
                }
            }
        }

        if (odCk > -1) {
            oddChild = d.get(odCk);
        }

        if (oddChild != null) {
//            System.out.println(stableValue+":"+diffValue);
            System.out.println(oddChild.getName() + " Was="+oddChild.getWeight()+", Now="+(oddChild.getWeight()-diffValue));
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
            return "Structure{" +
                    "name='" + name + '\'' +
                    ", weight=" + weight +
                    '}';
        }
    }
}
