.class public final Li8/H;
.super Li8/J;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public final b:Li8/A;

.field public final c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Li8/A;Lx8/j;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Li8/H;->a:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Li8/H;->b:Li8/A;

    iput-object p2, p0, Li8/H;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Li8/J;Li8/A;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Li8/H;->a:I

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput-object p1, p0, Li8/H;->c:Ljava/lang/Object;

    .line 5
    iput-object p2, p0, Li8/H;->b:Li8/A;

    return-void
.end method


# virtual methods
.method public final a()J
    .locals 2

    .line 1
    iget v0, p0, Li8/H;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Li8/H;->c:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Li8/J;

    .line 9
    .line 10
    invoke-virtual {v0}, Li8/J;->a()J

    .line 11
    .line 12
    .line 13
    move-result-wide v0

    .line 14
    return-wide v0

    .line 15
    :pswitch_0
    iget-object v0, p0, Li8/H;->c:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Lx8/j;

    .line 18
    .line 19
    invoke-virtual {v0}, Lx8/j;->d()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    int-to-long v0, v0

    .line 24
    return-wide v0

    .line 25
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
.end method

.method public final b()Li8/A;
    .locals 1

    .line 1
    iget v0, p0, Li8/H;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Li8/H;->b:Li8/A;

    .line 7
    .line 8
    return-object v0

    .line 9
    :pswitch_0
    iget-object v0, p0, Li8/H;->b:Li8/A;

    .line 10
    .line 11
    return-object v0

    .line 12
    nop

    .line 13
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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

.method public final c(Lx8/h;)V
    .locals 1

    .line 1
    iget v0, p0, Li8/H;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Li8/H;->c:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Li8/J;

    .line 9
    .line 10
    invoke-virtual {v0, p1}, Li8/J;->c(Lx8/h;)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :pswitch_0
    iget-object v0, p0, Li8/H;->c:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, Lx8/j;

    .line 17
    .line 18
    invoke-interface {p1, v0}, Lx8/h;->A(Lx8/j;)Lx8/h;

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    nop

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
