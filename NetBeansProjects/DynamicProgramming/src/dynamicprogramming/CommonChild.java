/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dynamicprogramming;

/**
 *
 * @author Kunwar
 */
public class CommonChild
{
    /*Correct*/
    public static int common(String str1, String str2){
        int L[][] = new int[str1.length()+1][str2.length()+1];
        for(int i=0;i<=str1.length();i++){
            for(int j=0;j<=str2.length();j++){
                if(i==0 || j==0)
                    L[i][j]=0;
                else if(str1.charAt(i-1)==str2.charAt(j-1)){
                    L[i][j] = L[i-1][j-1]+1;
                }
                else{
                    L[i][j] = Math.max(L[i-1][j],L[i][j-1]);
                }
            }
        }
        return L[str1.length()][str2.length()];
    }
    
    private static int Common(String a,String b){
        int length = a.length();
        int result[][] = new int[length+1][length+1];
        for(int i=0;i<=length;i++){
            result[0][i] = 0;
            result[i][0] = 0;
        }
        
        for(int i=1;i<=length;i++){
            for(int j=1;j<=length;j++){
                if(j > i){
                    result[i][j] = Math.max(result[i-1][j], Math.max(result[i-1][j-1],result[i][j-1]));
                }else{
                    if(a.charAt(i-1) == b.charAt(j-1)){
                        result[i][j] = Math.max(result[i-1][j], Math.max(result[i-1][j-1],result[i][j-1]))+1;
                    }else{
                        result[i][j] = Math.max(result[i-1][j], Math.max(result[i-1][j-1],result[i][j-1]));
                    }
                }
            }
        }
        for(int i=0;i<result.length;i++){
            for(int j=0;j<result.length;j++){
                System.out.print(result[i][j]+" ");
            }System.out.println("");
        }
        return result[length][length];
    }
    
    public static void main(String[] args)
    {
        String a = "VGXGPUAMKXKSZHKBPPHYKINKEZPLVFJAQMOPODOTKRJZRIMLVUMUARENEXCFYCEBEURGVJYOSPDHVUYFVTVNRDYLUACVRAYGGWNPNZIJDIFYERVJAOALCGXOVLDQFZAORAHDIGYOJKNVIAZTPCMXLVOVAFHJPHVSHYFIQQTQBXJJMQNGQJHWKCEXECMDKMZAKBZRKJWQDYUXDVOOSSJOATRYXMBWXBWEXNAGMAYGZYFNZPQFTOBTAOTUAYXMWVZLLKUJIDHUKZWZCLTGQNGGUFTUAHALWVJWQNCKSIZGZAJKHYJUJLKSESZAFZJMDTSBYLDHYLCGKYNGVMHNEQYJDUGOFKLITXAOYKFOQKZSZNJYARKUPRERIVHUBPEHXMOYDAKKLBDNFHFXAMOTUBELZVBOZJARAEFMLOTFTNQRJOLVUAMAHNDEKFDSQCFVMQBOCBOMJXRQSFSKEVFXPHCQOQKBBOMCYURWLRNHRHCTNTZLYLVWULBDKCDPPGYKICHJTPUKFNLXFCEVKJEZQSMEYCANJLBESSRFAZDPRCOMDPJIMSFBUSLKSYVEERGCGMONCTCSVYPOLPLCGSQYFKILRIXODIWQCYREIWKRPIUIASFKJEXPFTZNQIBLSRJUYFSKNDAPWJEFUCDQCIUEHVFNDGHRXXNMVZLJXIOYUNDVPNDABSBNWOEYOMRJDCQCRXVYAHERMUDCCMUEAHEBYVSAKXWSEQZDUYFEZUJAFFDRSQFSEQSDFCGDENMRFWFNDIJTEPXHNVEDFBAGZRXKPRTGBOUKFXIWHFZFKSNAWGCUBSPXSIUYTQRWMVXFSVZLOTLFWIMLIYGNFDDESWMXUVHNQVJZGKPDZFJMCJCMSAASKEXTLSJRGGTYCGCQFPOQOMROUHJKNTQRYHJIFCXBYWHFUTFZMJCDLIVNUXMRDFGHKQLQZAEEAZKOOMVPYSJWNCYQYABUTSITEZURQHBUWABEXRCUIWAFNFVCASMRMBQNUPRUSKHSMEICAQQESYYVOPEPMVDOSIBRVQOGHDEIKBPQBFGRUFXDSQCHJKUXPXNGEBXRMQDGQJSOSENCRBWKNLLVUCVUBYOZFMTTXTLSRRNRQAVSHASZRENHLBZPNPJGQFTVWGUKJWSEKFCGLLBZLNVMOSMVQUBTWSGLTVMMZMSLQDXQIIFZKAQHSXZGUSEUEXLYCGUBHDNWHRSSYIYBITCOOWLHMMRDPGTRDWALVFFKNWIBHWHACQFJCMWUPOXONAVVXWSVPRPYMSKZNABSQUWSSUCXRMYWERFPZIQDZIYCNYNTHGMDAVYBZBQGCRGVWALCPTUTZXSQLKCHITHCDEZSAEFLDDFLGTIXBNAGKQRZESCKRIHWQPLFPSPKQVIFBMNQWIDBKZQIYGWFUNEFIWPXUEUMDWUGBFGNOJJRJPAFGKIRRUEOEZABCQLZMCDWMKLVYZVUUGHETWKXZUZFVOIRAREYBLWPRDNETKYIGXYQPZXECKYGYXTHSZXGYIDGLDNLZEQNDBVACJQYHFKQVLIUSQMXYEQYQORZMMJWSUICNYXQNKTYLAQNVBJLLTEXGRHIFDNEUGYSZNCRWGIDCFJGDZKOQFQBWEUCHTDVPIUNKPEHCSHTMRENTGSNDNBTBBBMOGUOPYPWKAPKRWISAMNXAGZFQSFSXTYXEPBPUMTLUJGXUENMZGGJMGIUTQOELTNLYBOQJEGCVUUIILMSBNALVBSFUTYARENKEWZLPWGQZFNNKEXXDSUFCJVRBKESROBOSUZUMUCCGMRSMXZTPSIQCHFCLVZKMVFMUSCNBRLCZVFZWMMKTUSAJDHOCMPRJLNDYDXROJJAHOCITARXLQXQJXQHPFZEWPYYKZEQJPEHSGIQVYEZBQWNPYUCIOBBLOXJXUOZSUVQWPHLHGLUFBHJGBPKXJXIYEUWMDUSFMLXKVQSMWYTKJOAKBNPGPHEFWPQNRBXWDAIPPUEOLNGEDDTRXPAXXZIWPHXKEINQSDIVGPLBCSZJHSXEICKSXBSEJHGMKIHTJCQQWXFTJSWWPTMGZPTQNOIXWPARKLAYJDSBIJTRGTXGZFCPUCHDSMKVQRHGDIIDNNUNWSXSCQQNNQMPCPKAGZSXMCBORWJYQNNOUSXHSDMKLMNDNTFUKMSKHNFJNFRVHQOMOFZKQIPTSIHALUJJXKBURWSBDLLAPWRQCARXMLZQWFCALVWXJFLFJTSTVRCTLBKBSJPNXYHSCXDXEPBWQECEWRZCITMDFBWZHIOWCPGGBUNWIOPNJDJCWRMIXZQULDIALDWRDJMBHVKGQYSPROVNZFRBAJESSMYBYCKDQMSXSRYDSKOIKTYFXJOMBTWYSKCTDJFQUVEKMCKRWIVZAYCTXCFXPTGRUPRMPNZSWUOEGWGDBBYPIRUISJQIBACPBOMBSJOQOZZSDGDRGYQYRFRKSSNTFGUDFQRQZXECGUCLNXEATMLQXSJKYJXIFIRSWZUDOLGMNLJJZJUJUAYJIICCERVHAVVGTCWHLSRWAQOTOGOKHTWGJMFQSLVHZPGNSFQHGBOEHMZPONRTKQJUANPNUFNLUEZLJSQVTOFMENWFZLGRRPZETXOGOBQRHUHLYGENSBKPWQBWWCZNXEIYOZTKMGCVJUSURKTIEHAHZRNTRRASIKBABWCSRHACZNXYUDGFPQDPGUIJAWGHWVVFOGDVTUHMORJCEOFCTZQYGFIETZKBEGKBSJZMFZRMFPMGVOAFXFYINMAYUXCJREDRYDNVLXWVHUEAIQGLUUFBBDTPVTCFHPRLYRBVVLNTRQZMQAWBSSRANJHAXTJVSXSDUOZSXLOEBLCIFBYFEUONSYRICVCCFPKZTIOALHQHQEKYDZQXMNZCAPLZLYXVFBPDZMLSFMMLGTNFRAROEBTFDUZXGPSAQWCNJIYTSRZYFWKRDLABYWHCMFGZVCYBFLKACYHHCKASMBLHBDJEOJNFWYLCQVNBMZXUGFSIYJGUICGFFIWRSZZDBZJYHVGPNFSAPUFJQFESPXBFLJGTDGSMFEECQFWFVKWEIACDITMSNFALDCQLRYCLLMCCMODLNLBKWVGMDZWAPSBZYRWXASQVCTBMTBPIDEDMVRPXQNDCAHLTGZSHJARUUEMQUXRRVTHOHCDKUURWURKWEXHYPSBUPXUISDESHLTSVFHVJVHNXGGARVCDAIIAQADYJJERNIDPERSJDQUCSAUPRZTYFOIIKLHTJSZNDDFTCGELCHWBIZHESDUXMACMZILDECEGSHHNTFZNBBBGXAVMPNFLHPXYLXKYZTWBQWPUYMQLNXMETGHTNREFEYPIVPYNDOBBRESGVLMKKXWHLOMIGIRIZLNGKYKRYMHEYWUJWMJHNZXMGMKQGSAJKYKVQJYAPLNWKCUBVBXDXYHECCRZFNEHQEIZVICXXXESNSSFEUZHSJDHXNDDSIUVXANFKPEQODIRLSYWLYMIWSHVENLIUOMFLSYIQACJUAJHXMEKLFADFVXVMPKNEDSHBYVENBOQUEAAIQWEXNQGQVJWZFOFOKVKGDGZHWRTKTDBERAPDNUMYTFOBBQCOZOJIVHKNGVYYSTJGSDFNOSJLRXPZFENFYHWAJCJUPUWYUVKORVMIUPLWVOOOJCKJMAQYSPYACDNGDNMUYRSOISLCMORSFGZZKSPOSLTNXPVOHDSPMZKEWHWNJMMMGIQUYWBYJIOWEWRVFLTAJJRDUGEJYJRKWAZOGERWKHVGTQUXUXHRUBFRQYFARBIAEPORGWQUIJHBUWQVEJGCOJNCYUOPFGFPTTEUSXAJVQYNZZISGNXJHJETOMWBTTPGBSZZUWRFNORZXTOMUWNQPKUTTCBYBDHLUVCEXTUOXMZGIBULSZOBTMXUTCCLNYXCDFHZNMWHESGEZPVXPYCZLCGYAQNKGIJUKIIIUCJFUEQBMXQNWDCYBERSZMOFRWOCLBYNJWJCRQAYJPCIJNDYZMCTZBAOQEUGWRMHPKZVYYGKOVPCKBZETSHNEBUHTMQQPMBWSEOCXEOBHDJMKFMZVMKEZWOMLYZPAGRXGXYBZTSXAEUNETDTIKJBBXUQJCDWYHWREGFYJHCTUARLQOFGWHPYUTWRBYEBFSSWBRCZWXKLTZJGMFUXARYDAGGOJPHEUSIUBPMQJMHOCQMVJOSPDFLIVMSRCQTWGXDAZUNYTIFHXQUASVCGDLOZUQZWHFSSRCXARCJFLFTMWNGZONWFSVTUKXVBSOUBBBPBFWJFNGELEKPMOADIZDSORTKABMSWCMYWNBAJXNKVMNDBVTCPNJXWMODDNTSQTHUSVZMKUEDBDKBIQDWPWPSSRJJFLSWUFMHCLMNSTZUBTCVQVQSDSSGSCJYQZWCAMNVRILESSQPZGQXDLSNCLUJDSAQBXXYLTZLQWLUORTKQADJCQUQDQCSVIXGWGLWRRMKHDSBEBBJVCGZLWTBVASPHVMNFVFJYKQMIMWXEMMAHHMZOADAPWORUVLPQOLWBMKESKAFYZBVZVMMPRWAXISDUKVMBVCVZWXYNRTKSBDZKVAGIHFGIQMSDEJXIRROWIRGQVZELYSOHWVJFALSGXGZOKBFURVECUXSIPQVRWQJOSFYBNCIHPZJCBXEFZVRIISGFIPSIAPDPBSSGLQJUHVQRXEFPTIMXEDAHMJQTVIQRXNFPOYSAKXHXRJETYDSXIXVXYUJBVQAVXZUPQPZDQLNDDXFANWNKTLPJCCPWUYGXYYXUAFYPZOAKDXPKAHVPJJFDOGNZBYIXYBMKDAQLIXEUTOJGTDJLTWPXPVUMBUDCKMDXRHQWKRRLLTGXDYOAOKDPARWBANIDRFSSIUIGZDUWZEJBBNUOIWQLSGTESHSCNVLMJYIWHAGTIMRQTFFKFGBODLWXIRGRMRDHLIHYAMXMOLBYFWCDPUTEDZCWSKRPKYKQYPKSLSQNFNDIGWHJPDQMACLGNEBLKQCEPSNLJBYOYXCHDIYYGWCHTCOXYZZBLNCVOSGCFFRHAS";
        String b = "EVYRFZJIZJBKRFPPCJBHDPBYICJMVXNSXRLFUPSNIYCHUTSVGWTRJVNEPWFSSFOVSAXKHENZIDOHUQRMXXUMFDDYGFEYPTZCOURHVEDKDOACAMYUOYEINZLVOCYDNXYKXPFKXWMDOCFZGCBWJJZRJZVSLTCPVUHZNZLVNZBDQYJXQWGBTLLQADGXJFZRTMMVBDKCZRKYLNZEJAIPLDLCTXVKLOFQNQFFKYDZGTFBFERGKEQMCVYLZQIIUOCWGDVICASICRUGGKBSRGYLDPIWKURUYIHBERGCGGXWUJDPROKXYKQQBUITESPOHBQNKQKUGWHLHKGABAPHQTFDBFHGVBLUYXWZOPSQEUKCLFKFWKXQWZAKBWBHILYFKYOIITLSHCNCYQDMJNFJEKJJDZQSWMJVNDTMYANVUCNZBDUAMHAPYNGGABONFABHVNQMKSNYHYYDLHKFHHDKHVSUSNWPPWDWVAYFKSMBSXUJUVLAIGWMQSNZYTVWBPLYYDSPRLUCGXOAAJLLVQIIHBCKZLPASFSNSUSYFHBMCBFOSTWISFNREQQYTKDCAHMKZTUAXOJIFTFVWWVMODLJMNBJEOIFEYNMAXZKTXXPEDAGSNZUVFRKIGJDCKUZOSKNADBFLGISKPPHYGXZMCMFAZJXAZHBQBQRREZXLNIOKHFKKPDRHTCRUEQXLXXDCVJLXISJXAWESPGXOXJYGEOQZEMXIKVPQRFQBXYARJWOJEKEXBQAEDYUIPLLDVKYKWPWMZHEIQGDNKSFYMIUINMORLIZMXMLHXSJOTKROYPHYKJHRBEXHAFVCJETIIMMPQKSPSPLOAYAPWBXUJWJBBIHVGVKDCFPABBAYMCZPIMZTOQBIDTJSDNKGUDECSFSRREZFBTUXIXJKIPXTNCFQUQDTANIWLEVDYODLIIWUVBOGQZWWPURCQVRYSJZDBSUCBXNLKFGCVWAGOIQIGSNVKWEMYBVXUAERMVJJLDZSPJKPVEOFJVPVGVOKSJYIFNLGBRUBYVNDYNHVLUDRYLJRGBKYSZBXNVDBYAHLZTQXUIBBOTBFKHSGYKPGCRWLMXZMHIOVKLIJTBUTFDIOJSCLMCJTTAFLMSYDWUNHEIKKSKJHXADKTUYNCEYAJDKVEIMKSQWLOGDYYDDKSRARLPGFZZNZUAJFRFEUNQJUAWJHFMARNJUIYEUZTDVRZHCEZVSFKHCDGTTNPFNKHSYPMXBOBNQYLLOAKFKNOYPEORITDIQRKMJIFOUEIBYCUXNQNUNBTNLNKCIOHEFUQCYFOBIIYBUWPRQRFOKONIRFILFQGJHFPLYASYJMZQPDWTSBKGQCYUVTBUNQNHNAEFGPJNVAGTPXFQRGMXTSVAJTRPBDBNZQACKJDTAMMEUASETGWFZWBYSFOMABHMXHLNQTBALMJFHXROGODUKWEYZMJFHKIIATYPLTUNTSXAJRCDZFJWFXRQWHPOSVXEDXOMRDMBQHAVOCMVTKGGPULOVCCKLEYCFGTYPCNCNHTWUWRMZJPBSCIMPXCZRPBIXQVAMEGSEYPGECDDFOFLQTASXNGKYWTAIRATEGYVZXTTVBFDDKWXOBEZXFNWPZXKJCDPNLVWOZNDNFEGUHYCDOOMTXBPIQLQWOTOIBBQZWXVGKMQWOWATZOZGBTRDKNDCPIVAILDYXKKNZYIYYTBFLWPAITVIRSPTZDHLFSIABOMDXQHTFNVLEUOUKTABUAWPRTURPUMHGKBUACFFFOXRIUGZAQSENYFNMGQJMSJVOBAEUQKGWPYVWPAFBNXIODTCEMCDQAXVLNYCQYVAXXYBHVDKHIUHPVUMQBFRYWTQKUVJJEAEXYCJZHRFCLDUGQRVIYLXUBXWGTCPTVELFADQXBCVTSEZNBBUAEUDGEJCVYTASTWCZYJQHGLYHZTGDDICBNLVYTJHMHENXSDHVLYFLHZQSOIDECOJQGXSQKHVFKPLDTOQYRGADZGIOOLYNWZXJRUIIYBWCNWAUPWGMUEQDFYVSVLBHQQXKCEEBMWQJYPIYGYZCDBZPKYRHROJQMQSBJILAMAKICREORUIJZRHWWFKBVZUAJRSCCDHBKUNZVWRHSIPHMBDAMNNQKHTFKYQRDRCEXZFTUAXFRPHOIPMZXCZJCUOQCZGPRMZIOTDISOSKROXJKLEAHTIRTMVEUCAYQVJBJCRNDJVXVVOUMPCGCZWUMAAPDEPSHNAIMATOLVNLMEPBJZWXMACWILFYKKKUYSUCCMFTJUOCCUPAGBYAKRUGNNSGRVBXDWGTQZZWHBKYJDKFNIEPBOLVIWSBEVYPMEKZMEVXOHKSLYLOSUSKCVEHBYRRUYKOHNENCVYODSTLPWDWOOONHNIYEGMYEKMTOPUWYKWCTHHDWZQXOCNQGZMTCTBPUILLKMAWSSJTRGXLSPQQYCZVKHHFCUGLIDEMBZUNQFSPCPHJQTUAYWQBJJSQYDFOJZOFIRJWOIOBXHFDIMSVISXEYYRKSQALVHUQLQOJZVDMADAIUKMJQGFAFJQOYWDFXPMBUOXOEISIHWBLFTQBSBCMQSKWMHNWOJRJOOAHBBKCVKSOGUCZQZVRPBMDKQYICBHJAZSCXKVRMBXHUGUZXFEJGUIANOFATRARRNZPYVBLJZTDZLRFIZBLVXKJRFACEVLDDQMRGZYUHJFBVPVLZJFNBKPKUFNAOEJEQNSNKITMIGJVIBPVIJTBEVSSVLCQZMSHQNDHZHXGGCTDZPOGABKKJTNIXVVGXHKRYILLFJMJHNKKDIQWGPPVJVCBWEQOVKIDJEBMKOLZGSLHMRHIQGLVWHICMTOXPITUPETITSOBUIWYRKMZMWFMSGFOORVZEBZPVBSCVETJKNHNQTJHNINAVAWQHPKHBCSAGDNLYAADUSPPTMGECGCBYDSMNGFPLHLMEQPDUYJVIRVRZFBRFMQKEWXOTZGTHMVBXBNUYACTBIRPPWWYMERCDUZTLKJJMXGBHFINZEEZPOFNCRTDYCEPYBZWNHKZXKNJNOTDVKFKXWKWOBTKAWEBEZAJMLPFUXOAQMEEAPDEWVJDVHMJIFZVPJKAZWPCVLRUWWXATRFIEKSQFVFIGJWYTMBMLLCQPQJNELFQLBCGLODVHXBWJNTQPKEMPRBWNAVCPJWKCIEKOOVBCMSLERUKVJCQAIXQBCHUXCDIQCSOTCHLQBYAXHWAJAFWZAQMHRTXMFDIWFFYQTVVSWXGIDAOHUHDQSYMOZESUHIEHBBCHTPTSBKBWVRSVNDQYSXMWNDBAECMHPOPMSAUCXOHITLWDNCPBVMKCUDAJESJBGMVXVTPBOOPAEGUGLKUJIIZPQPQVYPIBOOOBDOJUFCVEWMZMADYLIHDJJYALDZXDYNFCKNHQBIJHMAJWMYIYKCNGPRIVZMOUZRXRFVMZSDHAQJEOGJYEJIWHZSEHQVUBFNEFKFLTAFNFCDXNMJIXQNOPGMYVZUVWUFVKFXMYCBBQIUBWEVLYJHDSMZEDRJWVLPVCXJLPNACMEHOWHRJIEEXEAVAHUQYRYHEGRGDBHSGQAHFIIHVPSVXGQJRGOBNTLFILNFPMIDKEHUQBJHCKHBCWEWFAIILHINFVDOJBDLPGNPRTORKRMMCZNCYWFYDRTUYOTFRMZVPHRKKTERJKIJUWCVJANXEQWCUIXLWFUEGNPHHKELAKDLTQEEBMUUQHEJPOBTDLYRFBZGUOKCWARIBQJCUUBQLYRUMVCRGTEIYUDJIDIPZNNGMPNFIONDGFQGPEQPGEKNHEJMNTASLYRZUYKRIIERZLIDIHPEBYIBUDVYNXGVVKLOQPDVRNYLINDKNAEHTDIOLSUFZGOXGOFOFURIVLOCFBPGCYOCVBGFMKALQZNBKWNZPKIQWRLIMNKBBXJPQHCTUXAHUQTFBRBKDAFALDVVZRRPLOEVUCBUDBUUUFWFGBUWGKAKDRYCBVLOSSJZHSCYIXWOYBDUWSBFKSHSKVZLBNDNHNCZSKZNQIUUUYNVRDUPFJORXZDEVVRNGHYBKQEANYEYJDCQXPHEKNPAKRGZTODMNJKQZAICVLWCIWYDFSRDDBGVFKCOCZAZKDUBFTKLNYPTMRKJIOKPECEIBEABQGCKLJYMBIACXYPKNGHOKWBIPGLAXBVXKWCJCDGHCKWAZBRDFRNTZBZVCTXKTQNXTNGQWVAPWVLZXPXCSIOJWHWTZYXLZUSVTRYNJXQZBBVZXFBHJCDAWJAUJUUGLNTLCNIGZINJUAZHHOZCTXPCRNSMQBEEZWHIBSEAFALDETCFKCVLMQCCLZIVVZUMHGAEPAIFGSCINZQJEDNTSYGVTWSQWREKGFEUSLRZYXXTXABLAWYWMPYFXBIGRRITWTELCILVQRNWLJMNBSCILFZOUJGRGQWZDGXZWSVKVWQTMUKXZDCYDENZNEIMHXWYATJEMDEQTXYPMVFEKHSPZFXHYKPGWLSJCDOBYFGEUGOVJNXOTXKDHJTIFFTJWHHDXCNWOLPHGOHJORXKQUCTLSDMGSVRDUPWVZRUSEDIOMVFSYERIWIXVPSMHIISMNSWPVAQEIXIRJNABCAPOHKXTFXZANQJUSTEAOCTNXACBOTRLXHGLSXMHMATZXFLTFJDAIYSQSZEJUPSBRGFEGHBWIJAVFINBBCFQRPUTGARLCNJYHZIADZPSUBZPEYPEFLUGWPGIFNXTGBJCGRLVVBMDKLGNYPLZBXZQSSQYLZZTKJLNMXMSLBOCOXQPGDARJAFTDZCVJSPXXIZQIEHGYOBWULEYAZGISEMUWVNCIPBDJCLIWBCPKZKPUQFTITGLWJTLHALWOUYGHRGJWRCNNRSAELAKVVUXUGYMUKRJBYFKYENHZBDTQEBVLTGLCJSEJWJUZCYNCMRIUQNNCNIAGCTKLFEZDFWKHLPIWZCZGHYCJLJQWVKMDNBJNKIZWBWHQWPPJNREFYQMCDUGXMDDRUAYHZUNFGCKDDZSJAKIEYZCZRHEFNJXLISNBITZYWZEDQNQCPAXPTG";
        System.out.println(common(a, b));
    }
    
}
