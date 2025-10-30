.class public abstract Lz3/i;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lz3/e;

.field public b:Lq3/u;

.field public c:Lq3/l;

.field public d:Lz3/g;

.field public e:J

.field public f:J

.field public g:J

.field public h:I

.field public i:I

.field public j:Lk4/E;

.field public k:J

.field public l:Z

.field public m:Z


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lz3/e;

    .line 5
    .line 6
    invoke-direct {v0}, Lz3/e;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lz3/i;->a:Lz3/e;

    .line 10
    .line 11
    new-instance v0, Lk4/E;

    .line 12
    .line 13
    const/16 v1, 0x1b

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    invoke-direct {v0, v1, v2}, Lk4/E;-><init>(IZ)V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, Lz3/i;->j:Lk4/E;

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


# virtual methods
.method public a(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lz3/i;->g:J

    .line 2
    .line 3
    return-void
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
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
.end method

.method public abstract b(LA4/r;)J
.end method

.method public abstract c(LA4/r;JLk4/E;)Z
.end method

.method public d(Z)V
    .locals 4

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    new-instance p1, Lk4/E;

    .line 6
    .line 7
    const/16 v2, 0x1b

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    invoke-direct {p1, v2, v3}, Lk4/E;-><init>(IZ)V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Lz3/i;->j:Lk4/E;

    .line 14
    .line 15
    iput-wide v0, p0, Lz3/i;->f:J

    .line 16
    .line 17
    const/4 p1, 0x0

    .line 18
    iput p1, p0, Lz3/i;->h:I

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 p1, 0x1

    .line 22
    iput p1, p0, Lz3/i;->h:I

    .line 23
    .line 24
    :goto_0
    const-wide/16 v2, -0x1

    .line 25
    .line 26
    iput-wide v2, p0, Lz3/i;->e:J

    .line 27
    .line 28
    iput-wide v0, p0, Lz3/i;->g:J

    .line 29
    .line 30
    return-void
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
.end method
