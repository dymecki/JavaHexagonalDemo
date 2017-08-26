package Domain.Model.Car;

import Domain.Common.ValueObject;

final public class FuelAmount extends ValueObject
{
    private Float  amount;
    private String unit;

    public FuelAmount(Float amount, String unit) throws Exception
    {
        if (amount <= 0) {
            throw new Exception("Fuel amount must be greater than zero: " + amount);
        }

        if (unit == "") {
            throw new Exception("Unit cannot be empty");
        }

        this.amount = amount;
        this.unit = unit;
    }

    public Float amount()
    {
        return amount;
    }

    public String unit()
    {
        return unit;
    }

    @Override
    public String toString()
    {
        return amount() + unit();
    }
}
