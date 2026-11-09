# Java-_HomeWork4
1. الكلاس الأول: InvalidAgeException.java :
public class InvalidAgeException: أنشأنا كلاس باسم الخطأ المطلوب.

extends Exception: معناها الكلاس هذا يرث من Exception، وبالتالي يصبح Checked Exception.

public InvalidAgeException(String message): هذا Constructor يستقبل رسالة الخطأ.

super(message): يبعث الرسالة للكلاس الأب Exception باش نقدروا نعرضوها باستعمال getMessage()
2. الكلاس الثاني: WorkshopRegistration.java :
تعريف الميثود public void registerParticipant(String name, int age) 
 throws InvalidAgeException:
 معناها الميثود ممكن تطلع الخطأ InvalidAgeException، وتخلي الكلاس اللي يستدعيها يتعامل معاه.
 throw new InvalidAgeException(...)    نطلقوا الخطأ، ونمرروا معاه رسالة
 3. الكلاس الثالث: Main.java :
 new WorkshopRegistration(): أنشأنا كائن من كلاس التسجيل.

try: نحطوا فيه الكود اللي ممكن يسبب Exception.

registerParticipant("Ali", 16): نحاولوا نسجلوا علي وعمره 16.

catch: يمسك الخطأ لو صار.

e.getMessage(): تجيب رسالة الخطأ اللي كتبناها في الكلاس الأول.
4. النتيجة (Output)
لما نشغلوا البرنامج، النتيجة بتكون:
Registration denied for Ali: Must be at least 18 years old (provided age: 16)
لو غيرنا العمر إلى 20؟ 
Ali registered successfully!.......
