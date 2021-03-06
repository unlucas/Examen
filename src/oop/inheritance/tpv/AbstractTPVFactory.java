package oop.inheritance.tpv;

import oop.inheritance.data.SupportedTerminal;
import java.util.Map;
import oop.inheritance.data.CommunicationType;

public abstract class AbstractTPVFactory {

    public static AbstractTPVFactory getFactory(SupportedTerminal supportedTerminal) {
        switch (supportedTerminal) {
            case INGENICO:
                return new IngenicoTPVFactory();
            case VERIFONEV240:
                return new VerifoneV240Factory();
            case VERIFONEVX520:
                return new VerifoneVX520Factory();
            case VERIFONEVX690:
                return new VerifoneVX690Factory();
        }

        throw new UnsupportedOperationException("Terminal not supported");
    }

    public abstract CardSwipper getCardSwipper();

    public abstract ChipReader getChipReader();

    public abstract Display getDisplay();

    public abstract Keyboard getKeyboard();

    public abstract Map<CommunicationType, CommunicationDevice> getCommunicationDeviceMap();

}