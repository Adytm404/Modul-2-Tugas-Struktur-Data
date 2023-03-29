import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> hewan = new ArrayList<>();
        hewan.add("Angsa");
        hewan.add("Bebek");
        hewan.add("Cicak");
        hewan.add("Domba");
        hewan.add("Bebek");
        hewan.add("Gajah");
        hewan.add("Badak");
        hewan.add("Elang");
        hewan.add("Ular");

        int jumlahBebek = 0;
        ArrayList<Integer> indexBebek = new ArrayList<>();
        for (int i = 0; i < hewan.size(); i++) {
            if (hewan.get(i).equals("Bebek")) {
                jumlahBebek++;
                indexBebek.add(i);
            }
        }

        System.out.println(hewan);
        System.out.println("\nJumlah Bebek = " + jumlahBebek);
        System.out.print("Posisi Index Bebek = ");
        for (int i = 0; i < indexBebek.size(); i++) {
            System.out.print(indexBebek.get(i));
            if (i != indexBebek.size() - 1) {
                System.out.print(",");
            }
        }

        Scanner input = new Scanner(System.in);
        System.out.print("\n\nMasukkan indeks hewan yang akan dihapus: ");
        int indeks = input.nextInt();
        hewan.remove(indeks);

        System.out.println("\n");
        System.out.println(hewan);
        System.out.println("\nHewan pada indeks ke-0: " + hewan.get(0));
        System.out.println("Hewan pada indeks ke-2: " + hewan.get(2));

        System.out.print("\nMasukkan nilai baru untuk indeks ke-0: ");
        String nilai0 = input.next();
        hewan.set(0, nilai0);

        System.out.print("Masukkan nilai baru untuk indeks ke-2: ");
        String nilai2 = input.next();
        hewan.set(2, nilai2);

        System.out.println("\n" + hewan);

        System.out.print("\nMasukkan indeks baru yang ingin ditambahkan: ");
        int indeksBaru = input.nextInt();
        System.out.print("Masukkan nilai untuk indeks baru: ");
        String nilaiBaru = input.next();
        if (indeksBaru >= hewan.size()) {
            hewan.add(nilaiBaru);
        } else {
            hewan.add(indeksBaru, nilaiBaru);
        }
        System.out.println("\n" + hewan);

        System.out.print("\nMasukkan indeks awal yang ingin dihapus: ");
        int indeksAwal = input.nextInt();
        System.out.print("Masukkan indeks akhir yang ingin dihapus: ");
        int indeksAkhir = input.nextInt();
        hewan.subList(indeksAwal, indeksAkhir+1).clear();
        System.out.println("\n" + hewan);


        System.out.println("\nElemen Pertama : " + hewan.get(0));
        System.out.println("Elemen Terakhir : " + hewan.get(hewan.size()-1));


        System.out.print("\nMasukkan nama hewan yang ingin dicari: ");
        String namaHewan = input.next();
        int posisiHewan = hewan.indexOf(namaHewan);
        if (posisiHewan != -1) {
            System.out.println("Posisi \"" + namaHewan + "\" ada pada index ke : " + posisiHewan);
        } else {
            System.out.println("Hewan \"" + namaHewan + "\" tidak ditemukan di dalam arraylist.");
        }
    }
}