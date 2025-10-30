.class public final synthetic LS3/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:LS3/r;


# direct methods
.method public synthetic constructor <init>(LS3/r;I)V
    .locals 0

    .line 1
    iput p2, p0, LS3/o;->a:I

    iput-object p1, p0, LS3/o;->b:LS3/r;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget v0, p0, LS3/o;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    iget-object v1, p0, LS3/o;->b:LS3/r;

    .line 8
    .line 9
    iput-boolean v0, v1, LS3/r;->C:Z

    .line 10
    .line 11
    invoke-virtual {v1}, LS3/r;->D()V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :pswitch_0
    iget-object v0, p0, LS3/o;->b:LS3/r;

    .line 16
    .line 17
    invoke-virtual {v0}, LS3/r;->D()V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
