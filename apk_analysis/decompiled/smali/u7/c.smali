.class public final synthetic Lu7/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;
.implements Ljava/lang/AutoCloseable;


# instance fields
.field public final synthetic a:Lu7/f;


# direct methods
.method public synthetic constructor <init>(Lu7/f;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu7/c;->a:Lu7/f;

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 1
    iget-object v0, p0, Lu7/c;->a:Lu7/f;

    invoke-virtual {v0}, Lu7/f;->a()V

    return-void
.end method
