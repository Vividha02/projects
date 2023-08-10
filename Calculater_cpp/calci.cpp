#include <iostream>
#include <cmath>
using namespace std;
int main()
{
    double num2, num1;
    double res;
    char op;
    do
    {
        cout << "chose the operator to continue or x to exit.";
        cout << "(+ - * / % ^ sqrt(a) cbrt(b) roundOff(c) log10(d) loge(e) exp(f) sin(g) cos(h) tan(i) lcm(j) hcf(k) ";
        cin >> op;

        switch (op)
        {
        case '+':
            cout << "enter the value of number 1";
            cin>>num1;
            cout<<"enter the value of number 2";
            cin>>num2;
            res = num1 + num2;
            cout<<res;
            break;

        case '-':
            cout<<"enter the value of number 1";
            cin>>num1;
            cout<<"enter the value of number 2";
            cin>>num2;
            res = num1 - num2;
            cout<<res;
            break;

        case '*':
            cout<<"enter the value of number 1";
            cin>>num1;
            cout<<"enter the value of number 2";
            cin>>num2;
            res = num1 * num2;
            cout<<res;
            break;

        case '/':
            cout<<"enter the value of number 1";
            cout<<num1;
            cout<<"enter the value of number 2";
            cout<<num2;
            res = num1 / num2;
            cout<<res;
            break;

        // case '%':
        //     cout<<"enter the value of number 1";
        //     cout<<num1;
        //     cout<<"enter the value of number 2";
        //     cout<<num2;
        //     res = num1 % num2;
        //     cout<<res;
        //     break;

        case '^':
            cout<<"enter the value of number 1";
            cout<<num1;
            cout<<"enter the value of number 2";
            cout<<num2;
            res = pow(num1, num2);
            cout<<res;
            break;

        case 'a':
            cout<<"enter the value of number 1";
            cin>>num1;
            res = sqrt(num1);
            cout<<res;
            break;

        case 'b':
            cout<<"enter the value of number 1";
            cin>>num1;
            res = cbrt(num1);
            cout<<res;
            break;

        case 'c':
            cout<<"enter the value of number 1";
            cin>>num1;
            res = round(num1);
            cout<<res;
            break;

        case 'd':
            cout<<"enter the value of number 1";
            cin>>num1;
            res = log10(num1);
            cout<<res;
            break;

        case 'e':
            cout<<"enter the value of number 1";
            cin>>num1;
            res = log(num1);
            cout<<res;
            break;

        case 'f':
            cout<<"enter the value of number 1";
            cin>>num1;
            res = exp(num1);
            cout<<res;
            break;

        case 'g':
            cout<<"enter the value of number 1";
            cin>>num1;
            res = sin(num1);
            cout<<res;
            break;

        case 'h':
            cout<<"enter the value of number 1";
            cin>>num1;
            res = cos(num1);
            cout<<res;
            break;

        case 'i':
            cout<<"enter the value of number 1";
            cin>>num1;
            res = tan(num1);
            cout<<res;

        // case 'j':
        //     cout<<"enter the value of number 1";
        //     cin>>num1;
        //     cout<<"enter the value of number 2";
        //     cin>>num2;

        //     double b = min(num1, num2);
        //     for (int i = b; i > 0; i--)
        //     {
        //         if ((num1 % i == 0) && (num2 % i == 0))
        //         {
        //             cout<<i;
        //             break;
        //         }
        //     }

        //     break;
        // case 'k':
        //     cout<<"enter the value of number 1";
        //     cin>>num1;
        //     cout<<"enter the value of number 2";
        //     cin>>num2;
        //     double c = max(num1, num2);
        //     for(int i =1;i<num2*num1;i++)
        //     {
        //         if ((i % num1 == 0) && (i % num2 == 0))
        //         {
        //             cout<<i;
        //             break;
        //         }
        //     }
        //     break;

        case 'x':
            cout<<"End";
            return 0;
        default:
            cout<<"Invalid Input";
            break;
        }

    } while (op!= 'x');
}