#include <bits/stdc++.h>

#include <boost/algorithm/string.hpp>
#include <cstring>
#include <fstream>
#include <iostream>
#include <string>
#include <vector>

using namespace std;

class VariableCondition
{
public:
    string condition;
    string variableName;
    char operand;
    int lineNo;
    int rValue;
    int tValue;
    int fValue;

public:
    VariableCondition(int lineNum, string s)
    {
        condition = s;
        lineNo = lineNum;
    }
};

vector<string> lines;
vector<string> parameterList;
vector<string> conditions;
vector<VariableCondition> variableCondition;

string trimLine(string s)
{
    int i = 0, j = 0;
    while (s[i] == ' ')
    {
        i++;
    }
    s = s.substr(i, s.size());
    i = s.size();
    while (s[i] == ' ' || s[i] == '\n')
    {
        i--;
    }
    s = s.substr(0, i);
    return s;
}

string extract_variable_name(string s)
{
    string tem = "";
    int index = 0;
    while (index < s.size() && (s[index] != '<' && s[index] != '>' && s[index] != '=' && s[index] != '!'))
    {
        tem += s[index];
        index++;
    }
    boost::algorithm::trim(tem);
    return tem;
}

int extract_value(string s)
{
    string tem = "";
    int index = s.size() - 1;
    while (index >= 0 && (s[index] != '<' && s[index] != '>' && s[index] != '='))
    {
        tem += s[index];
        index--;
    }
    reverse(tem.begin(), tem.end());
    int ret = stoi(tem);
    return ret;
}

char extract_operand(string s)
{
    int index = 0;
    while (index < s.size() && (s[index] != '<' && s[index] != '>' && s[index] != '=' && s[index] != '!'))
    {
        index++;
    }
    return s[index];
}

void readInputFile(char *fileName)
{
    ifstream inputFile(fileName);
    string temp;
    while (getline(inputFile, temp))
    {
        lines.push_back(trimLine(temp));
    }
}

void getParameterList()
{
    int startBracket = lines[0].find('(');
    string bracket_parameters = lines[0].substr(startBracket + 1);
    int closeBracket = bracket_parameters.find(')');
    string parameters = bracket_parameters.substr(0, closeBracket);

    stringstream check1(parameters);
    string intermediate;

    while (getline(check1, intermediate, ','))
    {
        parameterList.push_back(intermediate);
    }
    for (int i = 0; i < parameterList.size(); i++)
    {
        parameterList[i] = parameterList[i].substr(parameterList[i].find(' ')).substr(1);
    }
}

bool has_condition(string s)
{
    bool b = boost::algorithm::contains(s, "if") ||
             boost::algorithm::contains(s, "esle if") ||
             boost::algorithm::contains(s, "while");
    return b;
}

vector<string> extract_conditions(string s)
{
    int index = 0;
    vector<string> toRet;
    string tem = "";
    while (index < s.size())
    {
        tem += s[index];
        if (index + 1 < s.size() && ((s[index] == '&' && s[index + 1] == '&') || (s[index] == '|' && s[index + 1] == '|')))
        {
            tem[tem.size() - 1] = '\0';
            toRet.push_back(trimLine(tem));
            index += 2;
            tem = "";
            continue;
        }
        index++;
    }
    toRet.push_back(trimLine(tem));
    return toRet;
}

void get_condition(int lineNo, string s)
{
    int startBracket = s.find('(');
    string bracket_parameters = s.substr(startBracket + 1);
    int closeBracket = bracket_parameters.find(')');
    string conditionString = bracket_parameters.substr(0, closeBracket);
    vector<string> conditions = extract_conditions(conditionString);
    for (int i = 0; i < conditions.size(); i++)
    {
        VariableCondition newCondition(lineNo, conditions[i]);
        variableCondition.push_back(newCondition);
    }
}

void parseConditions()
{


    int maximum_value=1000, minimum_value=-1000, nominal_value=0;
    cout<<"Test No: Line No:        Condition:     Variable Name: Operands: Value: "<<endl;
    for (int i = 0; i < variableCondition.size(); i++)
    {
        variableCondition[i].variableName = extract_variable_name(variableCondition[i].condition);
        variableCondition[i].operand = extract_operand(variableCondition[i].condition);
        variableCondition[i].rValue = extract_value(variableCondition[i].condition);
        cout << i+1<< "\t\t" <<variableCondition[i].lineNo << "\t\t" << variableCondition[i].condition << "\t\t" << variableCondition[i].variableName << "\t" << variableCondition[i].operand << "\t"<< variableCondition[i].rValue <<endl;

        int nominal_value= variableCondition[i].rValue;
        if(variableCondition[i].operand=='=')
        {
            printf("Invalid Range : ");
            cout<<"["<<minimum_value<<","<<nominal_value-1<<"]"<<" , "<<"["<<nominal_value+1<<","<<maximum_value<<"]"<<endl;



            printf("Valid Range: ");
            cout<<"["<<nominal_value<<","<<nominal_value<<"]"<<endl;


            printf("Only valid test case : {");

            cout<<nominal_value;

            cout<<"}"<<endl;


            printf("10 invalid test cases : {");


            for(int i=0; i<5; i++)
            {

                int test =(rand()%(nominal_value-1-minimum_value+1))+minimum_value;
                cout<<test<<", ";

            }

            for(int i=0; i<5; i++)
            {

                int test =(rand()%(maximum_value-nominal_value-1+1))+nominal_value+1;
                cout<<test<<", ";

            }
            cout<<"}"<<endl;

        }
        else if(variableCondition[i].operand=='>')
        {

            printf("Invalid Range : ");
            cout<<"["<<minimum_value<<","<<nominal_value<<"]"<<endl;

            printf("Valid Range: ");
            cout<<"["<<nominal_value+1<<","<<maximum_value<<"]"<<endl;


            printf("5 invalid test cases : {");


            for(int i=0; i<5; i++)
            {

                int test =(rand()%(nominal_value-minimum_value+1))+minimum_value;
                cout<<test<<", ";

            }

            cout<<"}"<<endl;
            printf("5 valid test cases : {");

            for(int i=0; i<5; i++)
            {

                int test =(rand()%(maximum_value-nominal_value))+nominal_value+1;
                cout<<test<<", ";

            }
            cout<<"}"<<endl;

        }

        else if(variableCondition[i].operand=='<')
        {

            printf("Invalid Range : ");
            cout<<"["<<nominal_value<<","<<maximum_value<<"]"<<endl;


            printf("Valid Range: ");
            cout<<"["<<minimum_value<<","<<nominal_value-1<<"]"<<endl;



            printf("5 invalid test cases : {");


            for(int i=0; i<5; i++)
            {

                int test =(rand()%(maximum_value-nominal_value+1))+nominal_value;
                cout<<test<<", ";

            }

            cout<<"}"<<endl;
            printf("5 valid test cases : {");

            for(int i=0; i<5; i++)
            {

                int test =(rand()%(nominal_value-1-minimum_value))+minimum_value;
                cout<<test<<", ";

            }
            cout<<"}"<<endl;

        }

        cout<<endl<<endl<<endl;

    }
}

int main()
{
    readInputFile("testcase2.c");
    getParameterList();
    int conditionNumber = 0;
    for (int i = 0; i < lines.size(); i++)
    {
        if (has_condition(lines[i]))
        {
            get_condition(i, lines[i]);
            conditions.clear();
            conditionNumber++;
        }
    }
    parseConditions();
    return 0;
}
