package pl.javastart.task;

public class Microphone {
    String producer;
    String model;
    double price;
    String transducerType;
    double minSampleRate;
    double maxSampleRate;
    int bitRate;
    boolean isWireless;

    Microphone(String prod, String mod, double pr, String typeOfTransducer, double minSample, double maxSample, int bRate,
               boolean wireless) {
        producer = prod;
        model = mod;
        price = pr;
        transducerType = typeOfTransducer;
        minSampleRate = minSample;
        maxSampleRate = maxSample;
        bitRate = bRate;
        isWireless = wireless;
    }
}
