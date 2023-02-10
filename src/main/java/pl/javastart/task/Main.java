package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Microphone mic1 = new Microphone();
        Microphone mic2 = new Microphone();

        mic1.producer = "Behringer";
        mic1.model = "C-1U";
        mic1.price = 225;
        mic1.minSampleRate = 44.1;
        mic1.maxSampleRate = 48;
        mic1.bitRate = 16;
        mic1.transducerType = "condenser";
        mic1.isWireless = false;

        System.out.println("Microphone 1:\n" +
                "Model: " + mic1.producer + " " + mic1.model + "\n" +
                "Price: " + mic1.price + "zł\n" +
                "Sample rate from " + mic1.minSampleRate + "kHz to " + mic1.maxSampleRate + "kHz\n" +
                "Bitrate: " + mic1.bitRate + "bit\n" +
                "Transducer type: " + mic1.transducerType + "\n" +
                "Is it wireless: " + mic1. isWireless
                );

        mic2.producer = "Razer";
        mic2.model = "Seiren-X";
        mic2.price = 449;
        mic2.minSampleRate = 20;
        mic2.maxSampleRate = 40;
        mic2.bitRate = 16;
        mic2.transducerType = "condenser";
        mic2.isWireless = false;

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
