public interface IPay {

    default public String pay() {
        return "Paid";
    }
}
