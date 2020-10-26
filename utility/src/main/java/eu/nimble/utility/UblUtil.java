package eu.nimble.utility;

import eu.nimble.service.model.ubl.catalogue.CatalogueType;
import eu.nimble.service.model.ubl.commonaggregatecomponents.PartyIdentificationType;
import eu.nimble.service.model.ubl.commonaggregatecomponents.PartyNameType;
import eu.nimble.service.model.ubl.commonaggregatecomponents.PartyType;
import eu.nimble.service.model.ubl.commonbasiccomponents.TextType;

import java.util.*;
import java.util.stream.Collectors;

public class UblUtil {

    public enum LanguageID {
        ENGLISH("en"),
        SPANISH("es"),
        GERMAN("de"),
        TURKISH("tr"),
        ITALIAN("it");

        private final String id;

        LanguageID(final String id) {
            this.id = id;
        }

        @Override
        public String toString() {
            return id;
        }

    }

    public static String getText(Collection<TextType> textType, String languageID) {
        return textType.stream().filter(tt -> tt.getLanguageID().equals(languageID)).map(TextType::getValue).findFirst().orElse(null);
    }

    public static String getText(Collection<TextType> textType) {
        return textType.stream().filter(tt -> !tt.getValue().isEmpty()).map(TextType::getValue).findFirst().orElse(null);
    }

    public static String getName(Collection<PartyNameType> partyNameTypes, String languageID) {
        List<TextType> textTypes = partyNameTypes.stream().map(PartyNameType::getName).collect(Collectors.toList());
        return getText(textTypes, languageID);
    }

    public static String getName(Collection<PartyNameType> partyNameTypes) {
        List<TextType> textTypes = partyNameTypes.stream().map(PartyNameType::getName).collect(Collectors.toList());
        return getText(textTypes);
    }

    public static String getId(Collection<PartyIdentificationType> partyIdentifications) {
        String partyId = partyIdentifications.stream().map(PartyIdentificationType::getID).findFirst().orElse(null);
        return partyId;
    }

    /**
     * This method will return the party name (legal name) of a company, preference will be given to the default language ID : ENGLISH
     *
     * @param partyType
     * @return
     */
    public static String getName(PartyType partyType) {
        String name = getName(partyType.getPartyName(), LanguageID.ENGLISH.toString());
        if (name == null) {
            name = getName(partyType.getPartyName());
        }
        return name;
    }

    /**
     * Retrieves the identifier of provider party of a catalogue
     * @param catalogue
     * @return
     */
    public static String getCatalogueProviderPartyId(CatalogueType catalogue) {
        return catalogue.getProviderParty().getPartyIdentification().stream().map(PartyIdentificationType::getID).findFirst().orElse(null);
    }

}
