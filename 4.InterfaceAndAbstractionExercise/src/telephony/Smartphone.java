package telephony;

import java.util.List;

public class Smartphone implements Callable, Browsable {
    private List<String> numbers;
    private List<String> urls;

    public Smartphone(List<String> numbers, List<String> urls) {
        this.numbers = numbers;
        this.urls = urls;
    }

    @Override
    public String browse() {
        StringBuilder sb = new StringBuilder();

        for (String url : urls) {
            try {
                validateUrl(url);
                sb.append(String.format("Browsing: %s!", url))
                        .append(System.lineSeparator());
            } catch (IllegalArgumentException e) {
                sb.append(e.getMessage())
                        .append(System.lineSeparator());
            }
        }

        return sb.toString().trim();
    }

    private void validateUrl(String url) {
        if (url.matches(".*\\d.*")) {
            throw new IllegalArgumentException("Invalid URL!");
        }
    }

    @Override
    public String call() {
        StringBuilder sb = new StringBuilder();

        for (String number : numbers) {
            try {
                validateNumber(number);
                sb.append(String.format("Calling... %s", number))
                        .append(System.lineSeparator());
            } catch (IllegalArgumentException e) {
                sb.append(e.getMessage())
                        .append(System.lineSeparator());
            }
        }

        return sb.toString().trim();
    }

    private void validateNumber(String number) {
        if (!number.matches("\\d+")) {
            throw new IllegalArgumentException("Invalid number!");
        }
    }
}
