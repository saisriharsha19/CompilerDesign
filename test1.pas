program TestClasses;

class Counter
private
    value: integer;
public
    constructor Create;
    destructor Destroy;
    procedure Increment;
    function GetValue: integer;
end;

constructor Counter.Create;
begin
    value := 0
end;

destructor Counter.Destroy;
begin
    { cleanup if needed }
end;

procedure Counter.Increment;
begin
    value := value + 1
end;

function Counter.GetValue: integer;
begin
    GetValue := value
end;

var
    c: Counter;
begin
    c := new Counter;
    c.Increment;
    c.Increment;
    c.GetValue;
    c.Destroy
end.