.class public final Lco/notix/y9;
.super LG7/c;
.source "SourceFile"


# instance fields
.field public a:Lco/notix/ia;

.field public b:Ljava/lang/Object;

.field public c:Lco/notix/p8;

.field public d:Lco/notix/ej;

.field public e:Lco/notix/o8;

.field public synthetic f:Ljava/lang/Object;

.field public final synthetic g:Lco/notix/ia;

.field public h:I


# direct methods
.method public constructor <init>(Lco/notix/ia;LE7/d;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lco/notix/y9;->g:Lco/notix/ia;

    .line 2
    .line 3
    invoke-direct {p0, p2}, LG7/c;-><init>(LE7/d;)V

    .line 4
    .line 5
    .line 6
    return-void
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
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lco/notix/y9;->f:Ljava/lang/Object;

    iget p1, p0, Lco/notix/y9;->h:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lco/notix/y9;->h:I

    iget-object p1, p0, Lco/notix/y9;->g:Lco/notix/ia;

    const/4 v0, 0x0

    invoke-static {p1, v0, v0, v0, p0}, Lco/notix/ia;->a(Lco/notix/ia;Ljava/lang/String;Lco/notix/d3;Lco/notix/p8;LE7/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
