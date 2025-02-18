program NumberPrintTest;

class NumberManager 
public
    GetSum: integer; 
    constructor Create;
    function GetValue: integer;
    destructor Destroy;
    procedure Sum;
end;

constructor NumberManager.Create;
begin
    GetSum := 0
end;

destructor NumberManager.Destroy;
begin
    { cleanup if needed }
end;

procedure NumberManager.Sum;
begin
    GetSum := GetSum + 20;
end;

function NumberManager.GetValue: integer;
begin
    GetValue := GetSum
end;

var
    manager: NumberManager;
begin
    manager := new NumberManager;
    manager.Sum;
    manager.GetValue;
    manager.Destroy
end.