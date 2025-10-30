.class public abstract LE2/d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lo7/y;

.field public static final b:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lo7/v;

    .line 2
    .line 3
    invoke-direct {v0}, Lo7/v;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Lo7/y;

    .line 7
    .line 8
    invoke-direct {v1, v0}, Lo7/y;-><init>(Lo7/v;)V

    .line 9
    .line 10
    .line 11
    sput-object v1, LE2/d;->a:Lo7/y;

    .line 12
    .line 13
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 17
    .line 18
    .line 19
    sput-object v0, LE2/d;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 20
    .line 21
    return-void
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
.end method

.method public static a(LO7/p;LE7/d;)Ljava/lang/Object;
    .locals 3

    .line 1
    sget-object v0, LY7/K;->b:Lf8/d;

    .line 2
    .line 3
    new-instance v1, LE2/c;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v1, p0, v2}, LE2/c;-><init>(LO7/p;LE7/d;)V

    .line 7
    .line 8
    .line 9
    invoke-static {v0, v1, p1}, LY7/B;->C(LE7/i;LO7/p;LE7/d;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
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
