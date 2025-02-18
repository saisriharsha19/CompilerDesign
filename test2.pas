program InheritanceTest;

class BaseCounter
private
    value: integer;
public
    constructor Create;
    procedure Increment;
    procedure IncrementByTwo;
    function GetValue: integer;
end;

class ExtendedCounter(BaseCounter)
public
    procedure IncrementByTwo;
end;

constructor BaseCounter.Create;
begin
    value := 0
end;

procedure BaseCounter.Increment;
begin
    value := value + 1
end;

function BaseCounter.GetValue: integer;
begin
    GetValue := value
end;

procedure ExtendedCounter.IncrementByTwo;
begin
    value := value + 1
end;

begin
    c := new BaseCounter;
    c.Increment;
    c.Increment;
    c.GetValue;
end.