.class public abstract Lp8/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx8/I;


# instance fields
.field public final a:Lx8/q;

.field public b:Z

.field public final synthetic c:LU6/a;


# direct methods
.method public constructor <init>(LU6/a;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lp8/a;->c:LU6/a;

    .line 5
    .line 6
    new-instance v0, Lx8/q;

    .line 7
    .line 8
    iget-object p1, p1, LU6/a;->d:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p1, Lx8/C;

    .line 11
    .line 12
    iget-object p1, p1, Lx8/C;->a:Lx8/I;

    .line 13
    .line 14
    invoke-interface {p1}, Lx8/I;->c()Lx8/K;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-direct {v0, p1}, Lx8/q;-><init>(Lx8/K;)V

    .line 19
    .line 20
    .line 21
    iput-object v0, p0, Lp8/a;->a:Lx8/q;

    .line 22
    .line 23
    return-void
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
.method public final a()V
    .locals 5

    .line 1
    iget-object v0, p0, Lp8/a;->c:LU6/a;

    .line 2
    .line 3
    iget v1, v0, LU6/a;->a:I

    .line 4
    .line 5
    const/4 v2, 0x6

    .line 6
    if-ne v1, v2, :cond_0

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    const/4 v3, 0x5

    .line 10
    if-ne v1, v3, :cond_1

    .line 11
    .line 12
    iget-object v1, p0, Lp8/a;->a:Lx8/q;

    .line 13
    .line 14
    iget-object v3, v1, Lx8/q;->e:Lx8/K;

    .line 15
    .line 16
    sget-object v4, Lx8/K;->d:Lx8/J;

    .line 17
    .line 18
    iput-object v4, v1, Lx8/q;->e:Lx8/K;

    .line 19
    .line 20
    invoke-virtual {v3}, Lx8/K;->a()Lx8/K;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v3}, Lx8/K;->b()Lx8/K;

    .line 24
    .line 25
    .line 26
    iput v2, v0, LU6/a;->a:I

    .line 27
    .line 28
    return-void

    .line 29
    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 30
    .line 31
    new-instance v2, Ljava/lang/StringBuilder;

    .line 32
    .line 33
    const-string v3, "state: "

    .line 34
    .line 35
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    iget v0, v0, LU6/a;->a:I

    .line 39
    .line 40
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    throw v1
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
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
.end method

.method public b0(Lx8/g;J)J
    .locals 2

    .line 1
    iget-object v0, p0, Lp8/a;->c:LU6/a;

    .line 2
    .line 3
    const-string v1, "sink"

    .line 4
    .line 5
    invoke-static {p1, v1}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    :try_start_0
    iget-object v1, v0, LU6/a;->d:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, Lx8/C;

    .line 11
    .line 12
    invoke-virtual {v1, p1, p2, p3}, Lx8/C;->b0(Lx8/g;J)J

    .line 13
    .line 14
    .line 15
    move-result-wide p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 16
    return-wide p1

    .line 17
    :catch_0
    move-exception p1

    .line 18
    iget-object p2, v0, LU6/a;->c:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast p2, Ln8/i;

    .line 21
    .line 22
    invoke-virtual {p2}, Ln8/i;->l()V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, Lp8/a;->a()V

    .line 26
    .line 27
    .line 28
    throw p1
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

.method public final c()Lx8/K;
    .locals 1

    .line 1
    iget-object v0, p0, Lp8/a;->a:Lx8/q;

    .line 2
    .line 3
    return-object v0
    .line 4
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
.end method
