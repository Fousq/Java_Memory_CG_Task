package kz.zhanbolat.memory;

import java.util.Objects;

public class ContinuousObject {
    private Integer number;
    private ContinuousObject object;

    public ContinuousObject(Integer number) {
        this.number = number;
    }

    public ContinuousObject(Integer number, ContinuousObject object) {
        this.number = number;
        this.object = object;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public ContinuousObject getObject() {
        return object;
    }

    public void setObject(ContinuousObject object) {
        this.object = object;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ContinuousObject object1 = (ContinuousObject) o;
        return Objects.equals(number, object1.number) &&
                Objects.equals(object, object1.object);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, object);
    }

    @Override
    public String toString() {
        return "ContinuousObject{" +
                "number=" + number +
                ", object=" + object +
                '}';
    }
}
