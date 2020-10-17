package kz.zhanbolat.memory;

import java.util.Objects;

public class RecursiveObject {
    private InnerObject innerObject;

    public RecursiveObject() {
        this.innerObject = new InnerObject();
    }

    public RecursiveObject(InnerObject innerObject) {
        this.innerObject = innerObject;
    }

    public class InnerObject {
        private RecursiveObject object;

        public InnerObject() {
            object = new RecursiveObject(this);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            InnerObject that = (InnerObject) o;
            return Objects.equals(object, that.object);
        }

        @Override
        public int hashCode() {
            return Objects.hash(object);
        }

        @Override
        public String toString() {
            return "InnerObject{" +
                    "object=" + object +
                    '}';
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RecursiveObject that = (RecursiveObject) o;
        return Objects.equals(innerObject, that.innerObject);
    }

    @Override
    public int hashCode() {
        return Objects.hash(innerObject);
    }

    @Override
    public String toString() {
        return "RecursiveObject{" +
                "innerObject=" + innerObject +
                '}';
    }
}
