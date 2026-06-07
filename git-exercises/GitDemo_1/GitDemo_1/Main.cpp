#include "Header.h"

int main() {
	int num1 = 20, num2 = 10;
	int result = addition(num1, num2);
	cout << "Result: " << result << endl;

	result = substraction(num1, num2);
	cout << "Result: " << result << endl;

	result = multiplication(num1, num2);
	cout << "Result: " << result << endl;

	result = division(num1, num2);
	cout << "Result: " << result << endl;
}