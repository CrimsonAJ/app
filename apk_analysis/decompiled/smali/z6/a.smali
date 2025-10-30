.class public abstract Lz6/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LC0/e;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LC0/e;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, LC0/e;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lz6/a;->a:LC0/e;

    .line 8
    .line 9
    return-void
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
.end method

.method public static a(Lf5/h;Lf5/h;)Lf5/q;
    .locals 5

    .line 1
    new-instance v0, Lcom/google/firebase/messaging/u;

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    invoke-direct {v0, v1}, Lcom/google/firebase/messaging/u;-><init>(I)V

    .line 5
    .line 6
    .line 7
    new-instance v1, Lf5/i;

    .line 8
    .line 9
    iget-object v2, v0, Lcom/google/firebase/messaging/u;->a:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v2, Ls4/i;

    .line 12
    .line 13
    invoke-direct {v1, v2}, Lf5/i;-><init>(Ls4/i;)V

    .line 14
    .line 15
    .line 16
    new-instance v2, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 17
    .line 18
    const/4 v3, 0x0

    .line 19
    invoke-direct {v2, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 20
    .line 21
    .line 22
    new-instance v3, Lc7/d;

    .line 23
    .line 24
    const/16 v4, 0x8

    .line 25
    .line 26
    invoke-direct {v3, v1, v2, v0, v4}, Lc7/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 27
    .line 28
    .line 29
    sget-object v0, Lz6/a;->a:LC0/e;

    .line 30
    .line 31
    invoke-virtual {p0, v0, v3}, Lf5/h;->e(Ljava/util/concurrent/Executor;Lf5/a;)Lf5/q;

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1, v0, v3}, Lf5/h;->e(Ljava/util/concurrent/Executor;Lf5/a;)Lf5/q;

    .line 35
    .line 36
    .line 37
    iget-object p0, v1, Lf5/i;->a:Lf5/q;

    .line 38
    .line 39
    return-object p0
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
