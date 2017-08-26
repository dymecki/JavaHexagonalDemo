package Domain.Model.Car;

import Domain.Common.ValueObject;

final public class CarModel extends ValueObject
{
    private String name;

    CarModel(String name)
    {
        this.name = name;
    }

    public String name()
    {
        return name();
    }

    @Override
    public String toString()
    {
        return name();
    }
}
