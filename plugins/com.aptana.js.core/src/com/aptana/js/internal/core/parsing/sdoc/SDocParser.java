package com.aptana.js.internal.core.parsing.sdoc;

import java.util.ArrayList;
import java.util.List;
import com.aptana.core.util.StringUtil;
import beaver.*;
import com.aptana.js.internal.core.parsing.sdoc.model.*;

/**
 * This class is a LALR parser generated by
 * <a href="http://beaver.sourceforge.net">Beaver</a> v0.9.6.1
 * from the grammar specification "SDoc.grammar".
 */
@SuppressWarnings({ "unchecked", "rawtypes" })
public class SDocParser extends Parser {
	static public class AltGoals {
		static public final short Types = 43;
	}

	static final ParsingTables PARSING_TABLES = new ParsingTables(
		"U9pjLbbm55KKFTqpan029684H1A1a4aYX924oG9kgAmYYuY244GHPLTH1CKb22Y8gFYXfUN" +
		"oPPL#MPPLbe28YYYue2AB6o1kW0aI19U0UZtlzPrEPvXegloZwAbppxdBk##zxfxk1joPk1" +
		"3dupoSY$uOW7wu01UX3q9u52wAvJLaO0Ykm7XSZvcu4$VYVfJZ4Wp2A5oEIPYCwp0T2x04A" +
		"r2Qf5CNPECid6OvhyMTMbhNjyMLZoHPswd8oHT9nSKOI6lkjqBvMmHPQ8VMQizafYiYcZy3" +
		"KQGqoUSoSpPwsIwLj1LerIJlsNXsDF9feqXBMcDcwCtAmKG9VI##akfXfFj#Adiq7HUSupA" +
		"CKxzAUGH6iiTLACD4Mz46rPRRuXexeu4tybhBSp05Sv69M#n84ubYcbzrDswsV1$kiDmUzs" +
		"2vPeVxLRTYiTNphPUF1otdu264QNFG6GMMUw28cJ5MNua9r3EidesxC8zyEXOnjfIg8vQX0" +
		"phnIdH3Tze8pa5FHEGl#HCnESRTcjzG3CEbg9AriaPMqn$Bkgk9gRW1DzAVHNqJRiFjM4XL" +
		"GrJX0TgO79S6E7n#XRZ22AznAgzZcfsZ5rTUnNibmcTIUwueYtT11wwd4##DpdnIcNtcy1x" +
		"eQbUMoptb9UdKbjSYWsV2uvPsQlcC$sTjfo8dOwI8pn97xpTpjEOpf8tQJ6Oo#FRrycPKyG" +
		"dvJ6kzBdrO4ynxjZ4RfKtX$Cbgl1MOIg$QYvTHnVX$SFowQCAun3ayloXGLSPTnmXJKSmAm" +
		"mLaCwD1VAHXr#uXpBDZHff8YbR6iq4stLm$6#TK7L5elMYWjeIscBQHlSo9kf1SuCVwKeN9" +
		"fLJ6njaSPKIH$ONuZM9swTgVyKiLvRvVmJvXF#F5ok0TgsfeH6GFuCmXbXApYMKrDkqi9vv" +
		"M$HYnWbZZ#JnRS0vgxWd0RQDwFdM5wgdAJz5qCpe8ngSHJnBpr7#69Y#XffeuJ2nG$qNYMK" +
		"#x0sbwSFr2FOYwaZn4rpTNUM7YlFy67ak8bSJZn7FiDvJpVKWUJly5ucNg4SH8OXJz#FdOG" +
		"9YwqQndZREJ$dPTvnZwhn9VqDcjzVkKwvKRj7OiwmwGnv5TtNCwaSNOUF9geewe9R8Rr#sc" +
		"4HDKJmoSlwZ69b6l8uuJnHgRJBsHuFbpAhL#036CkIdapUG8UOpc0dtvLG1tEZ73#Bm4sxJ" +
		"6h8tNmXcP$FmwBpKJtn7OIoIWssh#47Lwad7rZFDUT3FLFqBThccDcs5YH9RM7ALk7#Ync7" +
		"XUQxC2yMgDTKcsvkR0SVqu9fkyY9oZFJfgRXTrzuJwMSeDp4K3EZT#hsli66DvyND8VaLvh" +
		"VBwm9vpDRP9sVn7UWTqJoAVUaiBzhCrqDUWJyBr2XDyDZbxrJVtOcL0nvZRhxtg0kDYZHgh" +
		"43XaktnA#ubw7ml$MRB5wW$aVTgFYCtMtoIVoLRPHlKUyQwDRPItv4toEyG66tcxIVU3KYi" +
		"7v2VvGtwJN#Me795VvB3Koo7vMNvdVZ#npw$#KRbMVg3ztlU#yzMtn5xY6sAF7zrDkyllKY" +
		"jVotghtY1UbtMCVENdllGLdn7okU$j97P8dR$qmVpUT0YNppg7NvyXHPXmx7kgjtqp$ZTYz" +
		"Xrfte8W7FlER4GaGKUQoQSagV6uXEigOTzIHR55Y0WhXpGM3kGY0KxLdFa6QSNtdsDHOH7o" +
		"kPmSH$z$03Bg$r0=");

	// suppress parser error reporting and let the custom error recovery mechanism handle it
	private static class SDocEvents extends Events
	{
		public void scannerError(Scanner.Exception e)
		{
		}

		public void syntaxError(Symbol token)
		{
		}

		public void unexpectedTokenRemoved(Symbol token)
		{
		}

		public void missingTokenInserted(Symbol token)
		{
		}

		public void misspelledTokenReplaced(Symbol token)
		{
		}

		public void errorPhraseRemoved(Symbol error)
		{
		}
	}

	/**
	 * parse
	 *
	 * @param source
	 */
	public Object parse(String source) throws java.lang.Exception
	{
		return parse(source, 0);
	}

	/**
	 * parse
	 *
	 * @param source
	 * @param offset
	 */
	public Object parse(String source, int offset) throws java.lang.Exception
	{
		// SDocScanner fScanner = new SDocScanner();
		SDocFlexScanner fScanner = new SDocFlexScanner();

		fScanner.setOffset(offset);
		fScanner.setSource(source);

		return parse(fScanner);
	}

	/**
	 * parseType
	 * 
	 * @param source
	 * @return
	 * @throws java.lang.Exception
	 */
	public List<Type> parseType(String source) throws java.lang.Exception
	{
		// SDocScanner fScanner = new SDocScanner();
		SDocFlexScanner fScanner = new SDocFlexScanner();

		fScanner.setOffset(0);
		fScanner.setSource(source);
		// fScanner.queueTypeTokens(0, source.length());

		// NOTE: we need to clear the scanner source since queueTypeTokens doesn't set the offset of one of the inner
		// scanners resulting in double scanning
		// fScanner.setSource(StringUtil.EMPTY);

		fScanner.yybegin(SDocFlexScanner.TYPES);

		Object result = parse(fScanner, AltGoals.Types);

		return (result instanceof List) ? (List<Type>) result : null;
	}

	public SDocParser() {
		super(PARSING_TABLES);


	report = new SDocEvents();
	}

	protected Symbol invokeReduceAction(int rule_num, int offset) {
		switch(rule_num) {
			case 3: // Block = START_DOCUMENTATION Text.text END_DOCUMENTATION
			{
					final Symbol text = _symbols[offset + 2];
					
			return new DocumentationBlock((String) text.value);
			}
			case 4: // Block = START_DOCUMENTATION Tags.tags END_DOCUMENTATION
			{
					final Symbol tags = _symbols[offset + 2];
					
			return new DocumentationBlock((List<Tag>) tags.value);
			}
			case 5: // Block = START_DOCUMENTATION Text.text Tags.tags END_DOCUMENTATION
			{
					final Symbol text = _symbols[offset + 2];
					final Symbol tags = _symbols[offset + 3];
					
			return new DocumentationBlock((String) text.value, (List<Tag>) tags.value);
			}
			case 6: // Block = INLINE_DOCUMENTATION.text
			{
					final Symbol text = _symbols[offset + 1];
					
	    	return new InlineDocumentationBlock((String)text.value);
			}
			case 7: // Text = Text.text TextPart.part
			{
					final Symbol text = _symbols[offset + 1];
					final Symbol part = _symbols[offset + 2];
					
			return new Symbol(text.value + " " + part.value);
			}
			case 18: // Tags = Tags.tags Tag.tag
			{
					final Symbol tags = _symbols[offset + 1];
					final Symbol _symbol_tag = _symbols[offset + 2];
					final Tag tag = (Tag) _symbol_tag.value;
					
			((List<Tag>) tags.value).add(tag);

			return tags;
			}
			case 19: // Tags = Tag.tag
			{
					final Symbol _symbol_tag = _symbols[offset + 1];
					final Tag tag = (Tag) _symbol_tag.value;
					
			List<Tag> tags = new ArrayList<Tag>();

			tags.add(tag);

			return new Symbol(tags);
			}
			case 22: // Tag = ADVANCED opt$Text.text
			{
					final Symbol text = _symbols[offset + 2];
					
			return new AdvancedTag((String) text.value);
			}
			case 23: // Tag = ALIAS Text.text
			{
					final Symbol text = _symbols[offset + 2];
					
			return new AliasTag((String) text.value);
			}
			case 24: // Tag = AUTHOR Text.text
			{
					final Symbol text = _symbols[offset + 2];
					
			return new AuthorTag((String) text.value);
			}
			case 25: // Tag = CLASS_DESCRIPTION LCURLY Namespace.name RCURLY Text.text
			{
					final Symbol _symbol_name = _symbols[offset + 3];
					final String name = (String) _symbol_name.value;
					final Symbol text = _symbols[offset + 5];
					
			return new ClassDescriptionTag(name, (String) text.value);
			}
			case 26: // Tag = CONSTRUCTOR opt$Text.text
			{
					final Symbol text = _symbols[offset + 2];
					
			return new ConstructorTag((String) text.value);
			}
			case 27: // Tag = EXAMPLE Text.text
			{
					final Symbol text = _symbols[offset + 2];
					
			return new ExampleTag((String) text.value);
			}
			case 28: // Tag = EXCEPTION LCURLY Types.types RCURLY opt$Text.text
			{
					final Symbol types = _symbols[offset + 3];
					final Symbol text = _symbols[offset + 5];
					
			return new ExceptionTag((List<Type>) types.value, (String) text.value);
			}
			case 29: // Tag = EXTENDS LCURLY Types.types RCURLY opt$Text.text
			{
					final Symbol types = _symbols[offset + 3];
					final Symbol text = _symbols[offset + 5];
					
			return new ExtendsTag((List<Type>) types.value, (String) text.value);
			}
			case 30: // Tag = INTERNAL opt$Text.text
			{
					final Symbol text = _symbols[offset + 2];
					
			return new InternalTag((String) text.value);
			}
			case 31: // Tag = METHOD opt$Text.text
			{
					final Symbol text = _symbols[offset + 2];
					
			return new MethodTag((String) text.value);
			}
			case 32: // Tag = MODULE opt$Text.text
			{
					final Symbol text = _symbols[offset + 2];
					
			return new ModuleTag((String) text.value);
			}
			case 33: // Tag = NAMESPACE LCURLY Namespace.name RCURLY opt$Text.text
			{
					final Symbol _symbol_name = _symbols[offset + 3];
					final String name = (String) _symbol_name.value;
					final Symbol text = _symbols[offset + 5];
					
			return new NamespaceTag(name, (String) text.value);
			}
			case 34: // Tag = OVERVIEW Text.text
			{
					final Symbol text = _symbols[offset + 2];
					
			return new OverviewTag((String) text.value);
			}
			case 35: // Tag = PARAM LCURLY Types.types RCURLY ParamName.name opt$Text.text
			{
					final Symbol types = _symbols[offset + 3];
					final Symbol _symbol_name = _symbols[offset + 5];
					final Parameter name = (Parameter) _symbol_name.value;
					final Symbol text = _symbols[offset + 6];
					
			return new ParamTag(name, (List<Type>) types.value, (String) text.value);
			}
			case 36: // Tag = PRIVATE opt$Text.text
			{
					final Symbol text = _symbols[offset + 2];
					
			return new PrivateTag((String) text.value);
			}
			case 37: // Tag = PROPERTY LCURLY Types.types RCURLY opt$Text.text
			{
					final Symbol types = _symbols[offset + 3];
					final Symbol text = _symbols[offset + 5];
					
			return new PropertyTag((List<Type>) types.value, (String) text.value);
			}
			case 38: // Tag = RETURN LCURLY Types.types RCURLY opt$Text.text
			{
					final Symbol types = _symbols[offset + 3];
					final Symbol text = _symbols[offset + 5];
					
			return new ReturnTag((List<Type>) types.value, (String) text.value);
			}
			case 39: // Tag = SEE Text.text
			{
					final Symbol text = _symbols[offset + 2];
					
			return new SeeTag((String) text.value);
			}
			case 40: // Tag = TYPE LCURLY Types.types RCURLY opt$Text.text
			{
					final Symbol types = _symbols[offset + 3];
					final Symbol text = _symbols[offset + 5];
					
			return new TypeTag((List<Type>) types.value, (String) text.value);
			}
			case 41: // Tag = UNKNOWN.name opt$Text.text
			{
					final Symbol _symbol_name = _symbols[offset + 1];
					final String name = (String) _symbol_name.value;
					final Symbol text = _symbols[offset + 2];
					
			return new UnknownTag(name, (String) text.value);
			}
			case 42: // Types = Types.types TypeDelimiter Type.type
			{
					final Symbol types = _symbols[offset + 1];
					final Symbol _symbol_type = _symbols[offset + 3];
					final Type type = (Type) _symbol_type.value;
					
			((List<Type>) types.value).add(type);

			return types;
			}
			case 43: // Types = Type.type
			{
					final Symbol _symbol_type = _symbols[offset + 1];
					final Type type = (Type) _symbol_type.value;
					
			List<Type> types = new ArrayList<Type>();

			types.add(type);

			return new Symbol(types);
			}
			case 46: // Type = IDENTIFIER.name
			{
					final Symbol _symbol_name = _symbols[offset + 1];
					final String name = (String) _symbol_name.value;
					
			return new Type(name);
			}
			case 47: // Type = IDENTIFIER.name LBRACKET RBRACKET
			{
					final Symbol _symbol_name = _symbols[offset + 1];
					final String name = (String) _symbol_name.value;
					
			return new ArrayType(new Type(name));
			}
			case 48: // Type = CLASS LESS_THAN Type.memberType GREATER_THAN
			{
					final Symbol _symbol_memberType = _symbols[offset + 3];
					final Type memberType = (Type) _symbol_memberType.value;
					
			return new ClassType(memberType);
			}
			case 49: // Type = ARRAY LBRACKET RBRACKET
			{
					
			return new ArrayType();
			}
			case 50: // Type = FUNCTION LBRACKET RBRACKET
			{
					
			return new FunctionType();
			}
			case 51: // Type = ARRAY
			{
					
			return new ArrayType();
			}
			case 52: // Type = ARRAY LESS_THAN Type.memberType GREATER_THAN
			{
					final Symbol _symbol_memberType = _symbols[offset + 3];
					final Type memberType = (Type) _symbol_memberType.value;
					
			return new ArrayType(memberType);
			}
			case 53: // Type = FUNCTION
			{
					
			return new FunctionType();
			}
			case 54: // Type = FUNCTION ReturnDelimiter Type.returnType
			{
					final Symbol _symbol_returnType = _symbols[offset + 3];
					final Type returnType = (Type) _symbol_returnType.value;
					
			FunctionType function = new FunctionType();

			function.addReturnType(returnType);

			return function;
			}
			case 55: // Type = FUNCTION ReturnDelimiter LPAREN Types.returnTypes RPAREN
			{
					final Symbol returnTypes = _symbols[offset + 4];
					
			FunctionType function = new FunctionType();

			for (Type returnType : (List<Type>) returnTypes.value)
			{
				function.addReturnType(returnType);
			}

			return function;
			}
			case 56: // Type = FUNCTION LPAREN RPAREN
			{
					
			return new FunctionType();
			}
			case 57: // Type = FUNCTION LPAREN RPAREN ReturnDelimiter Type.returnType
			{
					final Symbol _symbol_returnType = _symbols[offset + 5];
					final Type returnType = (Type) _symbol_returnType.value;
					
			FunctionType function = new FunctionType();

			function.addReturnType(returnType);

			return function;
			}
			case 58: // Type = FUNCTION LPAREN RPAREN ReturnDelimiter LPAREN Types.returnTypes RPAREN
			{
					final Symbol returnTypes = _symbols[offset + 6];
					
			FunctionType function = new FunctionType();

			for (Type returnType : (List<Type>) returnTypes.value)
			{
				function.addReturnType(returnType);
			}

			return function;
			}
			case 59: // Type = FUNCTION LPAREN Types.parameterTypes RPAREN
			{
					final Symbol parameterTypes = _symbols[offset + 3];
					
			FunctionType function = new FunctionType();

			for (Type parameterType : (List<Type>) parameterTypes.value)
			{
				function.addParameterType(parameterType);
			}

			return function;
			}
			case 60: // Type = FUNCTION LPAREN Types.parameterTypes RPAREN ReturnDelimiter Type.returnType
			{
					final Symbol parameterTypes = _symbols[offset + 3];
					final Symbol _symbol_returnType = _symbols[offset + 6];
					final Type returnType = (Type) _symbol_returnType.value;
					
			FunctionType function = new FunctionType();

			for (Type parameterType : (List<Type>) parameterTypes.value)
			{
				function.addParameterType(parameterType);
			}

			function.addReturnType(returnType);

			return function;
			}
			case 61: // Type = FUNCTION LPAREN Types.parameterTypes RPAREN ReturnDelimiter LPAREN Types.returnTypes RPAREN
			{
					final Symbol parameterTypes = _symbols[offset + 3];
					final Symbol returnTypes = _symbols[offset + 7];
					
			FunctionType function = new FunctionType();

			for (Type parameterType : (List<Type>) parameterTypes.value)
			{
				function.addParameterType(parameterType);
			}

			for (Type returnType : (List<Type>) returnTypes.value)
			{
				function.addReturnType(returnType);
			}

			return function;
			}
			case 64: // ParamName = TEXT.name
			{
					final Symbol _symbol_name = _symbols[offset + 1];
					final String name = (String) _symbol_name.value;
					
			return new Parameter(name);
			}
			case 65: // ParamName = LBRACKET TEXT.name RBRACKET
			{
					final Symbol _symbol_name = _symbols[offset + 2];
					final String name = (String) _symbol_name.value;
					
			Parameter result = new Parameter(name);

			result.setUsage(Usage.OPTIONAL);

			return result;
			}
			case 66: // ParamName = ELLIPSIS
			{
					
			Parameter result = new Parameter("...");

			result.setUsage(Usage.ONE_OR_MORE);

			return result;
			}
			case 67: // ParamName = LBRACKET ELLIPSIS RBRACKET
			{
					
			Parameter result = new Parameter("...");

			result.setUsage(Usage.ZERO_OR_MORE);

			return result;
			}
			case 20: // opt$Text = 
			{
				return new Symbol(null);
			}
			case 0: // $goal = Grammar
			case 2: // Grammar = Block
			case 8: // Text = TextPart
			case 9: // TextPart = TEXT
			case 10: // TextPart = LBRACKET
			case 11: // TextPart = RBRACKET
			case 12: // TextPart = LCURLY
			case 13: // TextPart = RCURLY
			case 14: // TextPart = POUND
			case 15: // TextPart = IDENTIFIER
			case 16: // TextPart = COLON
			case 17: // TextPart = ERROR
			case 21: // opt$Text = Text
			case 44: // TypeDelimiter = COMMA
			case 45: // TypeDelimiter = PIPE
			case 62: // ReturnDelimiter = COLON
			case 63: // ReturnDelimiter = ARROW
			case 68: // Namespace = IDENTIFIER
			case 69: // Namespace = FUNCTION
			case 70: // Namespace = ARRAY
			{
				return _symbols[offset + 1];
			}
			case 1: // $goal = $Types Types
			{
				return _symbols[offset + 2];
			}
			default:
				throw new IllegalArgumentException("unknown production #" + rule_num);
		}
	}
}
