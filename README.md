# Camel Quarkus Software Template for Backstage

## Installation

You can add this software template to your Backstage installation by opening the `app-config.yaml` file and adding the following section to the `catalog.locations` section:

```yaml
catalog:
  locations:
    # Add the following lines
    - type: url
      target: https://github.com/djcoleman/backstage-cq-template/blob/main/template.yaml
      rules:
        - allow: [Template]
```
