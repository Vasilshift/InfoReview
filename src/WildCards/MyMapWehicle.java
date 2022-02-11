package WildCards;

import org.jetbrains.annotations.Nullable;

import java.util.Collection;
import java.util.Map;
import java.util.function.Predicate;

public interface MyMapWehicle<Long, Wehicle> {
    void put(Long key, Wehicle value);

    @Nullable
    Wehicle get(Long key);
    void putAll(Map<Long, Wehicle> entries);

    Map<Long, Wehicle> getAll(Collection<Long> keys);

    Collection<Wehicle> getAll(Predicate<Wehicle> p);

}
