import { test, expect } from '@playwright/test';

test.describe('Checkboxes on the-internet.herokuapp.com', () => {

  test.beforeEach(async ({ page }) => {
    await page.goto('https://the-internet.herokuapp.com/checkboxes');
  });

  // Test 1: Verify checkboxes are present
  test('should have two checkboxes', async ({ page }) => {
    const checkbox1 = page.locator('input[type="checkbox"]:nth-child(1)');
    const checkbox2 = page.locator('input[type="checkbox"]:nth-child(3)');
    
    await expect(checkbox1).toBeVisible();
    await expect(checkbox2).toBeVisible();
  });

  // Test 2: Verify checkbox can be checked
  test('should be able to check the first checkbox', async ({ page }) => {
    const checkbox1 = page.locator('input[type="checkbox"]:nth-child(1)');
    
    await checkbox1.check(); // Check the checkbox
    await expect(checkbox1).toBeChecked(); // Assert it's checked
  });

  // Test 3: Verify checkbox can be unchecked
  test('should be able to uncheck the second checkbox', async ({ page }) => {
    const checkbox2 = page.locator('input[type="checkbox"]:nth-child(3)');
    
    await checkbox2.check(); // Ensure it's checked first
    await checkbox2.uncheck(); // Uncheck it
    await expect(checkbox2).not.toBeChecked(); // Assert it's unchecked
  });

  // Test 4: Verify if checkbox is checked
  test('should verify if the first checkbox is checked', async ({ page }) => {
    const checkbox1 = page.locator('input[type="checkbox"]:nth-child(1)');
    
    const isChecked = await checkbox1.isChecked();
    console.log(`Checkbox 1 is checked: ${isChecked}`);
    await expect(isChecked).toBe(false); // Assert the first checkbox is not checked initially
  });

  // Test 5: Verify clicking on the checkbox will check/uncheck it
  test('should toggle the state of the second checkbox', async ({ page }) => {
    const checkbox2 = page.locator('input[type="checkbox"]:nth-child(3)');
    
    await checkbox2.click(); // Toggle state (check if it was unchecked, uncheck if it was checked)
    await expect(checkbox2).toBeChecked(); // Assert it's checked after click
    
    await checkbox2.click(); // Toggle state again
    await expect(checkbox2).not.toBeChecked(); // Assert it's unchecked after click
  });

  // Test 6: Ensure both checkboxes can be checked at the same time
  test('should check both checkboxes', async ({ page }) => {
    const checkbox1 = page.locator('input[type="checkbox"]:nth-child(1)');
    const checkbox2 = page.locator('input[type="checkbox"]:nth-child(3)');
    
    await checkbox1.check();
    await checkbox2.check();
    
    await expect(checkbox1).toBeChecked();
    await expect(checkbox2).toBeChecked();
  });

  // Test 7: Ensure both checkboxes can be unchecked at the same time
  test('should uncheck both checkboxes', async ({ page }) => {
    const checkbox1 = page.locator('input[type="checkbox"]:nth-child(1)');
    const checkbox2 = page.locator('input[type="checkbox"]:nth-child(3)');
    
    await checkbox1.check();
    await checkbox2.check();
    
    await checkbox1.uncheck();
    await checkbox2.uncheck();
    
    await expect(checkbox1).not.toBeChecked();
    await expect(checkbox2).not.toBeChecked();
  });
});
