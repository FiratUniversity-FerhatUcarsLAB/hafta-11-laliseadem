//Adi Soyadi: Lalise Adem Wado.
//Ogrenci numara: 240541610.

//Her satirin sonuna calisma sirasi yorumlarini ekleyin.
public class Exercise4_2 {

    public static void main(String[] args) {  // #1
        zippo("rattle", 13);  // #2
    } // #16

    public static void baffle(String blimp) {   // #7
        System.out.println(blimp);  // #8
        zippo("ping", -5);          // #9
    } // #13

    public static void zippo(String quince, int flag) { // #3 , #10
        if (flag < 0) {                // #4 , #11
            System.out.println(quince + " zoop");  // #12
        } else {
            System.out.println("ik");       // #5
            baffle(quince);                 // #6
            System.out.println("boo-wa-ha-ha"); // #14
        }
    } // #15
}



2) baffle metoduna ilk gönderilen blimp değeri 5 tir.
3) Soru: Programın ürettiği tüm çıktı:
5
ping
55
pong
5
ping

    4) Hangi satırlar birden fazla kez çalıştı?

Tekrar eden satırlar:

zippo metodunun tanımı → satır:
public static void zippo(...) → #3 ve #10

if satırı → if (flag < 0) → #4 ve #11



