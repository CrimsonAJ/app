.class public final Lj3/h;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:J

.field public final b:J

.field public c:J

.field public d:J

.field public e:J

.field public f:J

.field public g:J

.field public h:J

.field public i:F

.field public j:F

.field public k:F

.field public l:J

.field public m:J

.field public n:J


# direct methods
.method public constructor <init>(JJ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-wide p1, p0, Lj3/h;->a:J

    .line 5
    .line 6
    iput-wide p3, p0, Lj3/h;->b:J

    .line 7
    .line 8
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    iput-wide p1, p0, Lj3/h;->c:J

    .line 14
    .line 15
    iput-wide p1, p0, Lj3/h;->d:J

    .line 16
    .line 17
    iput-wide p1, p0, Lj3/h;->f:J

    .line 18
    .line 19
    iput-wide p1, p0, Lj3/h;->g:J

    .line 20
    .line 21
    const p3, 0x3f7851ec    # 0.97f

    .line 22
    .line 23
    .line 24
    iput p3, p0, Lj3/h;->j:F

    .line 25
    .line 26
    const p3, 0x3f83d70a    # 1.03f

    .line 27
    .line 28
    .line 29
    iput p3, p0, Lj3/h;->i:F

    .line 30
    .line 31
    const/high16 p3, 0x3f800000    # 1.0f

    .line 32
    .line 33
    iput p3, p0, Lj3/h;->k:F

    .line 34
    .line 35
    iput-wide p1, p0, Lj3/h;->l:J

    .line 36
    .line 37
    iput-wide p1, p0, Lj3/h;->e:J

    .line 38
    .line 39
    iput-wide p1, p0, Lj3/h;->h:J

    .line 40
    .line 41
    iput-wide p1, p0, Lj3/h;->m:J

    .line 42
    .line 43
    iput-wide p1, p0, Lj3/h;->n:J

    .line 44
    .line 45
    return-void
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
.end method


# virtual methods
.method public final a()V
    .locals 7

    .line 1
    iget-wide v0, p0, Lj3/h;->c:J

    .line 2
    .line 3
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    cmp-long v4, v0, v2

    .line 9
    .line 10
    if-eqz v4, :cond_2

    .line 11
    .line 12
    iget-wide v4, p0, Lj3/h;->d:J

    .line 13
    .line 14
    cmp-long v6, v4, v2

    .line 15
    .line 16
    if-eqz v6, :cond_0

    .line 17
    .line 18
    move-wide v0, v4

    .line 19
    :cond_0
    iget-wide v4, p0, Lj3/h;->f:J

    .line 20
    .line 21
    cmp-long v6, v4, v2

    .line 22
    .line 23
    if-eqz v6, :cond_1

    .line 24
    .line 25
    cmp-long v6, v0, v4

    .line 26
    .line 27
    if-gez v6, :cond_1

    .line 28
    .line 29
    move-wide v0, v4

    .line 30
    :cond_1
    iget-wide v4, p0, Lj3/h;->g:J

    .line 31
    .line 32
    cmp-long v6, v4, v2

    .line 33
    .line 34
    if-eqz v6, :cond_3

    .line 35
    .line 36
    cmp-long v6, v0, v4

    .line 37
    .line 38
    if-lez v6, :cond_3

    .line 39
    .line 40
    move-wide v0, v4

    .line 41
    goto :goto_0

    .line 42
    :cond_2
    move-wide v0, v2

    .line 43
    :cond_3
    :goto_0
    iget-wide v4, p0, Lj3/h;->e:J

    .line 44
    .line 45
    cmp-long v4, v4, v0

    .line 46
    .line 47
    if-nez v4, :cond_4

    .line 48
    .line 49
    return-void

    .line 50
    :cond_4
    iput-wide v0, p0, Lj3/h;->e:J

    .line 51
    .line 52
    iput-wide v0, p0, Lj3/h;->h:J

    .line 53
    .line 54
    iput-wide v2, p0, Lj3/h;->m:J

    .line 55
    .line 56
    iput-wide v2, p0, Lj3/h;->n:J

    .line 57
    .line 58
    iput-wide v2, p0, Lj3/h;->l:J

    .line 59
    .line 60
    return-void
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
