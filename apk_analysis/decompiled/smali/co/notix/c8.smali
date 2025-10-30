.class public final Lco/notix/c8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lco/notix/t7;


# static fields
.field public static final f:Lco/notix/fb;

.field public static final g:J


# instance fields
.field public final a:Lco/notix/y8;

.field public final b:LY7/z;

.field public final c:LA7/e;

.field public final d:Lg8/a;

.field public final e:Ljava/util/LinkedHashMap;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    sget-object v0, Lco/notix/fb;->d:Lco/notix/fb;

    sput-object v0, Lco/notix/c8;->f:Lco/notix/fb;

    sget-object v0, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x1e

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    sput-wide v0, Lco/notix/c8;->g:J

    return-void
.end method

.method public constructor <init>(Lco/notix/d9;LY7/z;)V
    .locals 1

    .line 1
    const-string v0, "contextProvider"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "csIo"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lco/notix/c8;->a:Lco/notix/y8;

    .line 15
    .line 16
    iput-object p2, p0, Lco/notix/c8;->b:LY7/z;

    .line 17
    .line 18
    new-instance p1, Lco/notix/x7;

    .line 19
    .line 20
    invoke-direct {p1, p0}, Lco/notix/x7;-><init>(Lco/notix/c8;)V

    .line 21
    .line 22
    .line 23
    invoke-static {p1}, LZ0/a;->q(LO7/a;)LA7/l;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    iput-object p1, p0, Lco/notix/c8;->c:LA7/e;

    .line 28
    .line 29
    invoke-static {}, Lg8/e;->a()Lg8/d;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    iput-object p1, p0, Lco/notix/c8;->d:Lg8/a;

    .line 34
    .line 35
    new-instance p1, Ljava/util/LinkedHashMap;

    .line 36
    .line 37
    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 38
    .line 39
    .line 40
    iput-object p1, p0, Lco/notix/c8;->e:Ljava/util/LinkedHashMap;

    .line 41
    .line 42
    return-void
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

.method public static final a(Lco/notix/c8;Ljava/lang/String;LE7/d;)Ljava/lang/Object;
    .locals 5

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1
    instance-of v0, p2, Lco/notix/a8;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lco/notix/a8;

    iget v1, v0, Lco/notix/a8;->c:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lco/notix/a8;->c:I

    goto :goto_0

    :cond_0
    new-instance v0, Lco/notix/a8;

    invoke-direct {v0, p0, p2}, Lco/notix/a8;-><init>(Lco/notix/c8;LE7/d;)V

    :goto_0
    iget-object p2, v0, Lco/notix/a8;->a:Ljava/lang/Object;

    sget-object v1, LF7/a;->a:LF7/a;

    iget v2, v0, Lco/notix/a8;->c:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p2}, La/a;->A(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p2}, La/a;->A(Ljava/lang/Object;)V

    .line 2
    sget-object p2, LY7/K;->b:Lf8/d;

    .line 3
    new-instance v2, Lco/notix/b8;

    const/4 v4, 0x0

    invoke-direct {v2, p0, p1, v4}, Lco/notix/b8;-><init>(Lco/notix/c8;Ljava/lang/String;LE7/d;)V

    iput v3, v0, Lco/notix/a8;->c:I

    invoke-static {p2, v2, v0}, LY7/B;->C(LE7/i;LO7/p;LE7/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    const-string p0, "private suspend fun getC\u2026tream(it)\n        }\n    }"

    invoke-static {p2, p0}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p2
.end method


# virtual methods
.method public final a(Ljava/lang/String;Lco/notix/no;LE7/d;)Ljava/lang/Object;
    .locals 3

    .line 4
    sget-object v0, LY7/K;->b:Lf8/d;

    .line 5
    new-instance v1, Lco/notix/z7;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, p2, v2}, Lco/notix/z7;-><init>(Lco/notix/c8;Ljava/lang/String;Lco/notix/no;LE7/d;)V

    invoke-static {v0, v1, p3}, LY7/B;->C(LE7/i;LO7/p;LE7/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
