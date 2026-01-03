import pandas as pd

def selectFirstRows(employees: pd.DataFrame) -> pd.DataFrame:
    data=employees.head(3)
    return data