module.exports = {
    "extends": "stylelint-config-standard",
    "rules": {
        // Add or override rules as needed
        "indentation": 4, // Specify indentation (e.g., 4 spaces)
        "block-no-empty": true, // Disallow empty blocks
        "declaration-block-trailing-semicolon": "always", // Require trailing semicolons in declaration blocks
        "selector-pseudo-class-no-unknown": [true, { "ignorePseudoClasses": ["global"] }], // Disallow unknown pseudo-class selectors
        "color-no-invalid-hex": true, // Disallow invalid hex colors
        "comment-no-empty": true, // Disallow empty comments
        "declaration-colon-space-after": "always", // Require a single space after colons in declarations
        "declaration-colon-space-before": "never", // Disallow whitespace before colons in declarations
        "selector-type-no-unknown": true, // Disallow unknown type selectors
        "string-quotes": "double", // Specify double quotes for strings
        "unit-no-unknown": true, // Disallow unknown units
        "property-no-unknown": true, // Disallow unknown properties
        "selector-pseudo-element-no-unknown": true, // Disallow unknown pseudo-element selectors
        "selector-combinator-space-after": "always", // Require a single space after combinators in selectors
        "selector-combinator-space-before": "always", // Require a single space before combinators in selectors
        "selector-descendant-combinator-no-non-space": true, // Disallow non-space descendant combinators
        "at-rule-no-unknown": true, // Disallow unknown at-rules
        "comment-empty-line-before": "always", // Require empty lines before comments
        "max-empty-lines": 2, // Limit the number of adjacent empty lines
        "no-duplicate-selectors": true, // Disallow duplicate selectors
        "no-empty-source": true, // Disallow empty sources
        "no-extra-semicolons": true, // Disallow extra semicolons
        "no-invalid-double-slash-comments": true, // Disallow double-slash comments (//...) which are not supported by CSS
        "no-missing-end-of-source-newline": true, // Disallow missing end-of-source newlines
        "property-no-vendor-prefix": true, // Disallow vendor prefixes for properties
        "selector-max-id": 0, // Disallow ID selectors
        "value-no-vendor-prefix": true // Disallow vendor prefixes for values
    }
};
