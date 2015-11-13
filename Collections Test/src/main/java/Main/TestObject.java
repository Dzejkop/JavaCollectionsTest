package Main;

/**
 * Created by Jakobs on 2015-11-02.
 */
public class TestObject implements Comparable<TestObject> {
    public float floatValue;
    public int intValue;
    public String stringVar;

    public TestObject(float floatValue, int intValue, String stringVar) {
        this.floatValue = floatValue;
        this.intValue = intValue;
        this.stringVar = stringVar;
    }

    @Override
    public int compareTo(TestObject o) {
        if(floatValue == o.floatValue) {
            if(intValue == o.intValue) return 0;
            else return intValue - o.intValue > 0 ? 1 : -1;
        } else {
            return (floatValue - o.floatValue) > 0 ? 1 : -1;
        }
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TestObject that = (TestObject) o;

        if (Float.compare(that.floatValue, floatValue) != 0) return false;
        if (intValue != that.intValue) return false;
        return stringVar.equals(that.stringVar);

    }

    @Override
    public int hashCode() {
        int result = (floatValue != +0.0f ? Float.floatToIntBits(floatValue) : 0);
        result = 31 * result + intValue;
        result = 31 * result + stringVar.hashCode();
        return result;
    }
}
