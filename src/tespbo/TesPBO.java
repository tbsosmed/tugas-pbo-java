
package tespbo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class TesPBO {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        HashMap<String, ArrayList<data>> peopleByForename = new HashMap<String, ArrayList<data>>();
        ArrayList<data> people = new ArrayList<data>();
        System.out.println("Daftar Akun Baru");
        System.out.print("Nama Lengkap\t: "); 
        String namaLengkap = new Scanner(System.in).nextLine();
        System.out.print("Jenis Kelamin\t: ");
        String jenisKelamin = new Scanner(System.in).nextLine();
        System.out.print("Jurusan\t\t: "); 
        String jurusan = new Scanner(System.in).nextLine();
        System.out.print("Tanggal Lahir(ex:23 Juli 1997): "); 
        String tanggalLahir = new Scanner(System.in).nextLine();
        System.out.print("Hobby\t\t: "); 
        String hobby = new Scanner(System.in).nextLine();
        people.add(new data("Bagus Adi","Laki-Laki","Sosiologi","2 Juli 1997","Main Game"));
        people.add(new data("Alfan Aulia Mujib","Laki-Laki","Teknik Informatika","15 Januari 1997","Main Gitar"));
        people.add(new data("Bagas Aji ","Laki-Laki","Teknik Informatika","17 Agustus 1998","Main Game"));
        people.add(new data("Kurnia Meiga","Laki-Laki","Teknik Mesin","25 April 1997","Main Bola"));
        people.add(new data("Adinda Jelfani","Perempuan","Teknik Informatika","17 Oktober 1998","Shopping"));
        people.add(new data("Nina Isti Andriani","Perempuan","Teknik Informatika","1 Maret 1997","Membaca"));
        people.add(new data(namaLengkap, jenisKelamin, jurusan, tanggalLahir, hobby));

        ArrayList<data> pilihPeople = new ArrayList<data>();
        char pilih='y';
        int i=1;
        int pilihIndeks=1;
        while (pilih == 'y'){
            System.out.println("===========Daftar Semua User============");
            for (data b:people
                    ) {
                System.out.println(i+" "+b.getNamaLengkap());
                i++;
            }

            System.out.println("Masukkan Nama Circle ");
        String teman = scan.nextLine();

        peopleByForename.put(teman, pilihPeople);
        // read from it
        ArrayList<data> bobs = peopleByForename.get(teman);
        data bob1 = bobs.get(0);
        data bob2 = bobs.get(1);

        System.out.println("Nama Circle : "+teman);
        for (data a:bobs
             ) {
            System.out.println("Data ke-"+i);
            System.out.println("Nama : "+a.getNamaLengkap());
            System.out.println("Jenis kelamin : "+a.getJenisKelamin());
            System.out.println("Jurusan : "+a.getJurusan());
            System.out.println("Tanggal lahir : "+a.getTanggalLahir());
            System.out.println("Hobby : "+a.getHobby());
            System.out.println("");
            i++;
        }
    }
    
