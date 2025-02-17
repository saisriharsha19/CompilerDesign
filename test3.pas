program MultiPrintTest;

class NumberManager
private
    num1: integer;
    num2: integer;
    num3: integer;
    num4: integer;
    num5: integer;
public
    constructor Create;
    procedure InitializeNumbers;
    procedure PrintAllNumbers;
    function SumNumbers: integer;
end;

constructor NumberManager.Create;
begin
    num1 := 0;
    num2 := 0;
    num3 := 0;
    num4 := 0;
    num5 := 0
end;

procedure NumberManager.InitializeNumbers;
begin
    num1 := 10;
    num2 := 20;
    num3 := 30;
    num4 := 40;
    num5 := 50
end;

procedure NumberManager.PrintAllNumbers;
var
    temp: integer;
begin
    temp := num1;
    temp := num2;
    temp := num3;
    temp := num4;
    temp := num5
end;

function NumberManager.SumNumbers: integer;
var
    sum: integer;
begin
    sum := num1 + num2 + num3 + num4 + num5;
    SumNumbers := sum
end;

var
    manager: NumberManager;
    total: integer;
begin
    manager := new NumberManager;
    manager.InitializeNumbers;
    manager.PrintAllNumbers;
    total := manager.SumNumbers;
    total
end.