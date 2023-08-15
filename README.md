# Micard
* This is very simple practice with compose.
* The UI including column, and one compose function to build the box with icon and text.

## 1. The UI Structure
```mermaid
graph LR
  Column --> RoundIcon
	Column --> name["Naruto Uzumaki"]
	Column --> title["Shonin Ninja"]
	Column --> contact
	
	subgraph contact
		direction BT
		subgraph row_1
			icon
			Text
		end
	end
Column --> email
subgraph email
		direction BT
		subgraph row_2
			email_icon
			email_name
		end
	end
```

## 2. The result
![](docs/image.png)