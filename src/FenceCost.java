/*
You've just been hired by Alton's Hardware Store.
Your job is to develop a tool which will allow his customers to
calculate the cost for installing a fence.
Start by determining the algorithm to calculate the cost of installing the fence.

Create a program that will calculate the cost with tax
of fencing a rectangular yard.
The cost of the fencing will depend on the
amount of fencing required (the perimeter of the yard),
and the type of fencing used.
Gates can are available for an additional cost.
At least one gate is required.

Prices (including installation)
    Wooden fencing costs $25 per foot
    Chain-link fencing costs $15 per foot
    Gates cost $150 each. You must install at least one gate and can install up to 3
    A building permit is required. It costs $50.00.
    The tax rate is 6.0% but it doesn't apply to the building permit
Your algorithm should allow any other person to achieve the
same result by following your steps.
They should not have to think about what they are doing.

Pseudocode:
import scanner
declare method
declare vars for
    scanner, feetNeeded, fenceCode, fenceCost, gatesNeeded, gateCost, tax, permit, total
define conditionals for fence type
define switch for number of gates
calculate total cost
    ((fence type * per foot) + (gates)) +  tax) + permit
 */
import java.util.Scanner;

public class FenceCost {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int feetNeeded, fenceCode, gatesNeeded;
        double fenceCost, gateTotal, permit, gateCost, taxAmount, fenceTotal, subTotal, grandTotal;
        gateCost = 150.00;
        permit = 50.00;
        double tax = 0.06;
        String fenceType;

        System.out.println("How many feet of fence do you need?");
        feetNeeded = input.nextInt();

        System.out.println("What type of fence do you need?\n" +
                "Enter '1' for wooden fencing ($25 per foot).\n" +
                "Enter '2' for chain-link fencing ($15 per foot).");
        fenceCode = input.nextInt();

        if (fenceCode == 1) {
            fenceCost = 25;
            fenceType = "Wooden fencing";
        } else {
            fenceCost = 15;
            fenceType = "Chain-link fencing";
        }

        System.out.println("How many gates do you need?\n" +
                "Minimum: 1. Maximum: 3.");
        gatesNeeded = input.nextInt();

        fenceTotal = fenceCost * feetNeeded;
        gateTotal = gateCost * gatesNeeded;
        subTotal = fenceTotal + gateTotal;
        taxAmount = subTotal * tax;
        grandTotal = permit + subTotal + taxAmount;

        System.out.println("Your receipt:\n" +
                "Quantity \tItem \t\t\tCost");
        System.out.printf("%d \t\t%s \t$%.2f\n", feetNeeded, fenceType, fenceCost);
        System.out.printf("%d \t\t\tGate \t\t\t$%.2f\n\n", gatesNeeded, gateCost);
        System.out.printf("Subtotal: \t\t\t\t\t$%.2f\n\n", subTotal);
        System.out.printf("Tax: \t\t6%% \t\t\t\t$%.2f\n", taxAmount);
        System.out.println("1 \t\t\tPermit \t\t\t$50.00\n");
        System.out.printf("Grand Total: \t\t\t\t$%.2f", grandTotal);
    }
}
