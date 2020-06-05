package telephony;

import java.util.List;

public class Smartphone implements Callable, Browsable {
    private List<String> numbers;
    private List<String> urls;

    public Smartphone(List<String> numbers, List<String> urls) {
        this.numbers = numbers;
        this.urls = urls;
    }

    public boolean canBrowse() {
        return urls.size() > 0;
    }

    @Override
    public String browse() {
        String url = urls.get(0);
        urls.remove(0);

        validateUrl(url);
        return String.format("Browsing: %s!", url);
    }

    private void validateUrl(String url) {
        if (url.matches(".*\\d.*")) {
            throw new IllegalArgumentException("Invalid URL!");
        }
    }

    public boolean canCall() {
        return this.numbers.size() > 0;
    }

    @Override
    public String call() {
        String number = numbers.get(0);
        numbers.remove(0);

        validateNumber(number);

        return String.format("Calling... %s", number);
    }

    private void validateNumber(String number) {
        if(!number.matches("\\d+")) {
            throw new IllegalArgumentException("Invalid number!");
        }
    }
}
