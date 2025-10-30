.class public final LB1/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/Object;

.field public final b:Ljava/lang/Object;

.field public final c:J

.field public final d:J

.field public final e:Z

.field public final f:Li8/w;


# direct methods
.method public constructor <init>(Li8/L;)V
    .locals 3

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    sget-object v0, LA7/f;->a:LA7/f;

    new-instance v1, LB1/a;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, LB1/a;-><init>(LB1/b;I)V

    invoke-static {v0, v1}, LZ0/a;->p(LA7/f;LO7/a;)LA7/e;

    move-result-object v1

    iput-object v1, p0, LB1/b;->a:Ljava/lang/Object;

    .line 21
    new-instance v1, LB1/a;

    const/4 v2, 0x1

    invoke-direct {v1, p0, v2}, LB1/a;-><init>(LB1/b;I)V

    invoke-static {v0, v1}, LZ0/a;->p(LA7/f;LO7/a;)LA7/e;

    move-result-object v0

    iput-object v0, p0, LB1/b;->b:Ljava/lang/Object;

    .line 22
    iget-wide v0, p1, Li8/L;->k:J

    iput-wide v0, p0, LB1/b;->c:J

    .line 23
    iget-wide v0, p1, Li8/L;->l:J

    iput-wide v0, p0, LB1/b;->d:J

    .line 24
    iget-object v0, p1, Li8/L;->e:Li8/v;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p0, LB1/b;->e:Z

    .line 25
    iget-object p1, p1, Li8/L;->f:Li8/w;

    iput-object p1, p0, LB1/b;->f:Li8/w;

    return-void
.end method

.method public constructor <init>(Lx8/C;)V
    .locals 11

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    sget-object v0, LA7/f;->a:LA7/f;

    new-instance v1, LB1/a;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, LB1/a;-><init>(LB1/b;I)V

    invoke-static {v0, v1}, LZ0/a;->p(LA7/f;LO7/a;)LA7/e;

    move-result-object v1

    iput-object v1, p0, LB1/b;->a:Ljava/lang/Object;

    .line 3
    new-instance v1, LB1/a;

    const/4 v3, 0x1

    invoke-direct {v1, p0, v3}, LB1/a;-><init>(LB1/b;I)V

    invoke-static {v0, v1}, LZ0/a;->p(LA7/f;LO7/a;)LA7/e;

    move-result-object v0

    iput-object v0, p0, LB1/b;->b:Ljava/lang/Object;

    const-wide v0, 0x7fffffffffffffffL

    .line 4
    invoke-virtual {p1, v0, v1}, Lx8/C;->a0(J)Ljava/lang/String;

    move-result-object v4

    .line 5
    invoke-static {v4}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v4

    iput-wide v4, p0, LB1/b;->c:J

    .line 6
    invoke-virtual {p1, v0, v1}, Lx8/C;->a0(J)Ljava/lang/String;

    move-result-object v4

    .line 7
    invoke-static {v4}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v4

    iput-wide v4, p0, LB1/b;->d:J

    .line 8
    invoke-virtual {p1, v0, v1}, Lx8/C;->a0(J)Ljava/lang/String;

    move-result-object v4

    .line 9
    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v4

    if-lez v4, :cond_0

    move v4, v3

    goto :goto_0

    :cond_0
    move v4, v2

    :goto_0
    iput-boolean v4, p0, LB1/b;->e:Z

    .line 10
    invoke-virtual {p1, v0, v1}, Lx8/C;->a0(J)Ljava/lang/String;

    move-result-object v4

    .line 11
    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v4

    .line 12
    new-instance v5, Lf5/o;

    const/4 v6, 0x5

    invoke-direct {v5, v6}, Lf5/o;-><init>(I)V

    move v6, v2

    :goto_1
    if-ge v6, v4, :cond_2

    .line 13
    invoke-virtual {p1, v0, v1}, Lx8/C;->a0(J)Ljava/lang/String;

    move-result-object v7

    .line 14
    sget-object v8, LH1/f;->a:[Landroid/graphics/Bitmap$Config;

    const/16 v8, 0x3a

    const/4 v9, 0x6

    .line 15
    invoke-static {v7, v8, v2, v9}, LW7/d;->R(Ljava/lang/CharSequence;CII)I

    move-result v8

    const/4 v9, -0x1

    if-eq v8, v9, :cond_1

    .line 16
    invoke-virtual {v7, v2, v8}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v9

    const-string v10, "substring(...)"

    invoke-static {v9, v10}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v9}, LW7/d;->j0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v9

    add-int/2addr v8, v3

    invoke-virtual {v7, v8}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7, v10}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v5, v9, v7}, Lf5/o;->y(Ljava/lang/String;Ljava/lang/String;)V

    add-int/2addr v6, v3

    goto :goto_1

    .line 17
    :cond_1
    const-string p1, "Unexpected header: "

    invoke-virtual {p1, v7}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 18
    :cond_2
    invoke-virtual {v5}, Lf5/o;->z()Li8/w;

    move-result-object p1

    iput-object p1, p0, LB1/b;->f:Li8/w;

    return-void
.end method


# virtual methods
.method public final a(Lx8/B;)V
    .locals 5

    .line 1
    iget-wide v0, p0, LB1/b;->c:J

    .line 2
    .line 3
    invoke-virtual {p1, v0, v1}, Lx8/B;->Y(J)Lx8/h;

    .line 4
    .line 5
    .line 6
    const/16 v0, 0xa

    .line 7
    .line 8
    invoke-virtual {p1, v0}, Lx8/B;->y(I)Lx8/h;

    .line 9
    .line 10
    .line 11
    iget-wide v1, p0, LB1/b;->d:J

    .line 12
    .line 13
    invoke-virtual {p1, v1, v2}, Lx8/B;->Y(J)Lx8/h;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1, v0}, Lx8/B;->y(I)Lx8/h;

    .line 17
    .line 18
    .line 19
    iget-boolean v1, p0, LB1/b;->e:Z

    .line 20
    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    const-wide/16 v1, 0x1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const-wide/16 v1, 0x0

    .line 27
    .line 28
    :goto_0
    invoke-virtual {p1, v1, v2}, Lx8/B;->Y(J)Lx8/h;

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1, v0}, Lx8/B;->y(I)Lx8/h;

    .line 32
    .line 33
    .line 34
    iget-object v1, p0, LB1/b;->f:Li8/w;

    .line 35
    .line 36
    invoke-virtual {v1}, Li8/w;->size()I

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    int-to-long v2, v2

    .line 41
    invoke-virtual {p1, v2, v3}, Lx8/B;->Y(J)Lx8/h;

    .line 42
    .line 43
    .line 44
    invoke-virtual {p1, v0}, Lx8/B;->y(I)Lx8/h;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v1}, Li8/w;->size()I

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    const/4 v3, 0x0

    .line 52
    :goto_1
    if-ge v3, v2, :cond_1

    .line 53
    .line 54
    invoke-virtual {v1, v3}, Li8/w;->c(I)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v4

    .line 58
    invoke-virtual {p1, v4}, Lx8/B;->X(Ljava/lang/String;)Lx8/h;

    .line 59
    .line 60
    .line 61
    const-string v4, ": "

    .line 62
    .line 63
    invoke-virtual {p1, v4}, Lx8/B;->X(Ljava/lang/String;)Lx8/h;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v1, v3}, Li8/w;->f(I)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v4

    .line 70
    invoke-interface {p1, v4}, Lx8/h;->X(Ljava/lang/String;)Lx8/h;

    .line 71
    .line 72
    .line 73
    invoke-interface {p1, v0}, Lx8/h;->y(I)Lx8/h;

    .line 74
    .line 75
    .line 76
    add-int/lit8 v3, v3, 0x1

    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_1
    return-void
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
