import java.util.Scanner;

public class LettoreMultimediale {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ElementoMultimediale[] elementi = new ElementoMultimediale[5];

        // Creazione dei 5 elementi.
        for (int i = 0; i < 5; i++) {
            boolean inputValido = false;
            while (!inputValido) {
                System.out.println("Inserisci il tipo di elemento (1=Immagine, 2=Video, 3=RegistrazioneAudio):");
                int tipo = scanner.nextInt();
                scanner.nextLine(); // Consuma il newline
                System.out.println("Inserisci il titolo:");
                String titolo = scanner.nextLine();

                switch (tipo) {
                    case 1 -> {
                        System.out.println("Inserisci la luminosità:");
                        int luminosita = scanner.nextInt();
                        elementi[i] = new Immagine(titolo, luminosita);
                        inputValido = true;
                    }
                    case 2 -> {
                        System.out.println("Inserisci la durata, il volume e la luminosità:");
                        int durata = scanner.nextInt();
                        int volume = scanner.nextInt();
                        int luminosita = scanner.nextInt();
                        elementi[i] = new Video(titolo, durata, volume, luminosita);
                        inputValido = true;
                    }
                    case 3 -> {
                        System.out.println("Inserisci la durata e il volume:");
                        int durata = scanner.nextInt();
                        int volume = scanner.nextInt();
                        elementi[i] = new RegistrazioneAudio(titolo, durata, volume);
                        inputValido = true;
                    }
                    default -> System.out.println("Tipo non valido. Riprova.");
                }
            }
        }

        // Esecuzione
        while (true) {
            System.out.println("Inserisci un numero da 1 a 5 per eseguire un elemento, oppure 0 per uscire:");
            int scelta = scanner.nextInt();
            if (scelta == 0) {
                break;
            } else if (scelta >= 1 && scelta <= 5) {
                elementi[scelta - 1].esegui();
            } else {
                System.out.println("Scelta non valida.");
            }
        }

        scanner.close();
    }
}
