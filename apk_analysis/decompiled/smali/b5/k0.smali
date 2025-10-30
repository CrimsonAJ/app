.class public final Lb5/k0;
.super Ljava/util/concurrent/FutureTask;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;


# instance fields
.field public final a:J

.field public final b:Z

.field public final c:Ljava/lang/String;

.field public final synthetic d:Lb5/m0;


# direct methods
.method public constructor <init>(Lb5/m0;Ljava/lang/Runnable;ZLjava/lang/String;)V
    .locals 2

    .line 1
    iput-object p1, p0, Lb5/k0;->d:Lb5/m0;

    const/4 v0, 0x0

    invoke-direct {p0, p2, v0}, Ljava/util/concurrent/FutureTask;-><init>(Ljava/lang/Runnable;Ljava/lang/Object;)V

    .line 2
    sget-object p2, Lb5/m0;->k:Ljava/util/concurrent/atomic/AtomicLong;

    .line 3
    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicLong;->getAndIncrement()J

    move-result-wide v0

    iput-wide v0, p0, Lb5/k0;->a:J

    iput-object p4, p0, Lb5/k0;->c:Ljava/lang/String;

    iput-boolean p3, p0, Lb5/k0;->b:Z

    const-wide p2, 0x7fffffffffffffffL

    cmp-long p2, v0, p2

    if-nez p2, :cond_0

    iget-object p1, p1, LD/n;->a:Ljava/lang/Object;

    check-cast p1, Lb5/n0;

    .line 4
    iget-object p1, p1, Lb5/n0;->i:Lb5/V;

    .line 5
    invoke-static {p1}, Lb5/n0;->f(Lb5/x0;)V

    .line 6
    const-string p2, "Tasks index overflow"

    iget-object p1, p1, Lb5/V;->f:Lb5/T;

    invoke-virtual {p1, p2}, Lb5/T;->b(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public constructor <init>(Lb5/m0;Ljava/util/concurrent/Callable;Z)V
    .locals 2

    .line 7
    iput-object p1, p0, Lb5/k0;->d:Lb5/m0;

    invoke-direct {p0, p2}, Ljava/util/concurrent/FutureTask;-><init>(Ljava/util/concurrent/Callable;)V

    .line 8
    sget-object p2, Lb5/m0;->k:Ljava/util/concurrent/atomic/AtomicLong;

    .line 9
    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicLong;->getAndIncrement()J

    move-result-wide v0

    iput-wide v0, p0, Lb5/k0;->a:J

    const-string p2, "Task exception on worker thread"

    iput-object p2, p0, Lb5/k0;->c:Ljava/lang/String;

    iput-boolean p3, p0, Lb5/k0;->b:Z

    const-wide p2, 0x7fffffffffffffffL

    cmp-long p2, v0, p2

    if-nez p2, :cond_0

    iget-object p1, p1, LD/n;->a:Ljava/lang/Object;

    check-cast p1, Lb5/n0;

    .line 10
    iget-object p1, p1, Lb5/n0;->i:Lb5/V;

    .line 11
    invoke-static {p1}, Lb5/n0;->f(Lb5/x0;)V

    .line 12
    const-string p2, "Tasks index overflow"

    iget-object p1, p1, Lb5/V;->f:Lb5/T;

    invoke-virtual {p1, p2}, Lb5/T;->b(Ljava/lang/String;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public final compareTo(Ljava/lang/Object;)I
    .locals 4

    .line 1
    check-cast p1, Lb5/k0;

    .line 2
    .line 3
    iget-boolean v0, p1, Lb5/k0;->b:Z

    .line 4
    .line 5
    iget-boolean v1, p0, Lb5/k0;->b:Z

    .line 6
    .line 7
    if-eq v1, v0, :cond_0

    .line 8
    .line 9
    if-nez v1, :cond_1

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget-wide v0, p0, Lb5/k0;->a:J

    .line 13
    .line 14
    iget-wide v2, p1, Lb5/k0;->a:J

    .line 15
    .line 16
    cmp-long p1, v0, v2

    .line 17
    .line 18
    if-gez p1, :cond_2

    .line 19
    .line 20
    :cond_1
    const/4 p1, -0x1

    .line 21
    return p1

    .line 22
    :cond_2
    if-lez p1, :cond_3

    .line 23
    .line 24
    :goto_0
    const/4 p1, 0x1

    .line 25
    return p1

    .line 26
    :cond_3
    iget-object p1, p0, Lb5/k0;->d:Lb5/m0;

    .line 27
    .line 28
    iget-object p1, p1, LD/n;->a:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast p1, Lb5/n0;

    .line 31
    .line 32
    iget-object p1, p1, Lb5/n0;->i:Lb5/V;

    .line 33
    .line 34
    invoke-static {p1}, Lb5/n0;->f(Lb5/x0;)V

    .line 35
    .line 36
    .line 37
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    iget-object p1, p1, Lb5/V;->g:Lb5/T;

    .line 42
    .line 43
    const-string v1, "Two tasks share the same index. index"

    .line 44
    .line 45
    invoke-virtual {p1, v0, v1}, Lb5/T;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    const/4 p1, 0x0

    .line 49
    return p1
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
.end method

.method public final setException(Ljava/lang/Throwable;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lb5/k0;->d:Lb5/m0;

    .line 2
    .line 3
    iget-object v0, v0, LD/n;->a:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Lb5/n0;

    .line 6
    .line 7
    iget-object v0, v0, Lb5/n0;->i:Lb5/V;

    .line 8
    .line 9
    invoke-static {v0}, Lb5/n0;->f(Lb5/x0;)V

    .line 10
    .line 11
    .line 12
    iget-object v1, p0, Lb5/k0;->c:Ljava/lang/String;

    .line 13
    .line 14
    iget-object v0, v0, Lb5/V;->f:Lb5/T;

    .line 15
    .line 16
    invoke-virtual {v0, p1, v1}, Lb5/T;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-super {p0, p1}, Ljava/util/concurrent/FutureTask;->setException(Ljava/lang/Throwable;)V

    .line 20
    .line 21
    .line 22
    return-void
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
