package bio.terra.azurepoc;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatusController {

    private static final String template = "Hello %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/status")
    public Status status(@RequestParam(value = "name", defaultValue = "from Azure") String name) {
        return new Status(true,
        String.format(template, name),
        counter.incrementAndGet());
    }
}
