import { test, expect } from '@playwright/test';

test('keyboard example', async ({ page }) => {
  await page.goto('https://textbox.johnjago.com');

  const textArea = page.locator('textarea');

  await textArea.pressSequentially('Selenium Training');
  await textArea.press('Control+A');
  await textArea.press('Backspace');

  await textArea.click();

  await page.keyboard.type('Hello World');
  await page.keyboard.press('ArrowLeft');

  await page.keyboard.down('Shift');
  await page.keyboard.press('ArrowLeft');
  await page.keyboard.up('Shift');
});
