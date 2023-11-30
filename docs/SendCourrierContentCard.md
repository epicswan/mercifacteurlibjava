# SendCourrierContentCard

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**format** | [**FormatEnum**](#FormatEnum) | Format de la carte : postcard, naked-postcard, classic, folded, large, large-a4 |  [optional]
**visuel** | [**SendCourrierContentCardVisuel**](SendCourrierContentCardVisuel.md) |  |  [optional]
**text** | [**SendCourrierContentCardText**](SendCourrierContentCardText.md) |  |  [optional]
**coin** | [**CoinEnum**](#CoinEnum) | Type de coins de la carte (arrondi ou carre) |  [optional]
**papier** | [**PapierEnum**](#PapierEnum) | Type de papier de la carte (classic, nacre ou creation) |  [optional]

<a name="FormatEnum"></a>
## Enum: FormatEnum
Name | Value
---- | -----
POSTCARD | &quot;postcard&quot;
NAKED_POSTCARD | &quot;naked-postcard&quot;
CLASSIC | &quot;classic&quot;
FOLDED | &quot;folded&quot;
LARGE | &quot;large&quot;
LARGE_A4 | &quot;large-a4&quot;

<a name="CoinEnum"></a>
## Enum: CoinEnum
Name | Value
---- | -----
ARRONDI | &quot;arrondi&quot;
CARRE | &quot;carre&quot;

<a name="PapierEnum"></a>
## Enum: PapierEnum
Name | Value
---- | -----
CLASSIC | &quot;classic&quot;
NACRE | &quot;nacre&quot;
CREATION | &quot;creation&quot;
