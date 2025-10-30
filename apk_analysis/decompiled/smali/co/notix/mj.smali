.class public final Lco/notix/mj;
.super LG7/c;
.source "SourceFile"


# instance fields
.field public synthetic a:Ljava/lang/Object;

.field public b:I


# direct methods
.method public constructor <init>(LE7/d;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, LG7/c;-><init>(LE7/d;)V

    .line 2
    .line 3
    .line 4
    return-void
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lco/notix/mj;->a:Ljava/lang/Object;

    iget p1, p0, Lco/notix/mj;->b:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lco/notix/mj;->b:I

    const/4 p1, 0x0

    invoke-static {p1, p1, p0}, Lco/notix/nj;->a(Lco/notix/s8;Lorg/json/JSONObject;LE7/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
