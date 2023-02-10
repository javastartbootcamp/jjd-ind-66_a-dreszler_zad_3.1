package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Microphone mic1 = new Microphone("Behringer", "C-1U", 225,"condenser" , 44.1,
                48, 16, false);
        Microphone mic2 = new Microphone("Razer", "Seiren-X", 449, "condenser", 20,
                40, 16, false);


        System.out.println("Microphone 1:\n" +
                "Model: " + mic1.producer + " " + mic1.model + "\n" +
                "Price: " + mic1.price + "zł\n" +
                "Sample rate from " + mic1.minSampleRate + "kHz to " + mic1.maxSampleRate + "kHz\n" +
                "Bitrate: " + mic1.bitRate + "bit\n" +
                "Transducer type: " + mic1.transducerType + "\n" +
                "Is it wireless: " + mic1. isWireless
                );

        System.out.println("Microphone 2:\n" +
                "Model: " + mic2.producer + " " + mic2.model + "\n" +
                "Price: " + mic2.price + "zł\n" +
                "Sample rate from " + mic2.minSampleRate + "kHz to " + mic2.maxSampleRate + "kHz\n" +
                "Bitrate: " + mic2.bitRate + "bit\n" +
                "Transducer type: " + mic2.transducerType + "\n" +
                "Is it wireless: " + mic2. isWireless
        );
    }
}
