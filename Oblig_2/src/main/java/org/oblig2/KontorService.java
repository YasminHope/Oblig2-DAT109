package org.oblig2;

/**
 * Klasse for å opprette nytt kontor
 *
 * @author Ingelin Vikre
 */
import java.util.Scanner;

public class KontorService {
    private final Scanner scanner;

    public KontorService(Scanner scanner) {
        this.scanner = scanner;
    }

    public Kontor opprettNyttKontor() {
        System.out.print("Skriv inn kontorets kontornr: ");
        int kontornr = Integer.parseInt(scanner.nextLine());

        System.out.print("Skriv inn kontorets telefonnummer: ");
        String telefonnr = scanner.nextLine();

        System.out.print("Skriv inn kontorets gateadresse: ");
        String gateadresse = scanner.nextLine();

        System.out.print("Skriv inn kontorets postnummer: ");
        int postnr = Integer.parseInt(scanner.nextLine());

        System.out.print("Skriv inn kontorets poststed: ");
        String poststed = scanner.nextLine();

        Adresse adresse = new Adresse(gateadresse, postnr, poststed);
        return new Kontor(kontornr, telefonnr, adresse);
    }
}
