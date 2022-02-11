package WildCards;

import org.jetbrains.annotations.Nullable;

import java.util.Collection;
import java.util.Map;
import java.util.function.Predicate;

public class Ford extends Car implements MyMapWehicle {

    public Ford(int wheel, String light, String disk) {
        super(wheel, light, disk);
    }

    @Override
    public void put(Object key, Object value) {

    }

    @Nullable
    @Override
    public Object get(Object key) {
        return null;
    }

    @Override
    public void putAll(Map entries) {

    }

    @Override
    public Map getAll(Collection keys) {
        return null;
    }

    @Override
    public Collection getAll(Predicate p) {
        return null;
    }
}
